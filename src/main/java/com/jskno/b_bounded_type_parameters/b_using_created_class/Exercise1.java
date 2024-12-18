package com.jskno.b_bounded_type_parameters.b_using_created_class;

public class Exercise1 {

    public static void main(String[] args) {
        System.out.println(add(2, 3));
        System.out.println(add(25.8516, 3.14123));
    }

    public static <T extends Number> double add(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();

    }

    @SuppressWarnings("unchecked")
    public static <T extends Number> T addAndReturnSameType(T num1, T num2) {
        if (num1 instanceof Integer) {
            return (T) Integer.valueOf(num1.intValue() + num2.intValue());
        } else if (num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() + num2.doubleValue());
        } else if (num1 instanceof Float) {
            return (T) Float.valueOf(num1.floatValue() + num2.floatValue());
        } else if (num1 instanceof Long) {
            return (T) Long.valueOf(num1.longValue() + num2.longValue());
        } else if (num1 instanceof Short) {
            return (T) Short.valueOf((short) (num1.shortValue() + num2.shortValue()));
        } else if (num1 instanceof Byte) {
            return (T) Byte.valueOf((byte) (num1.byteValue() + num2.byteValue()));
        } else {
            throw new IllegalArgumentException("Unsupported Number type: " + num1.getClass());
        }
    }

    @SuppressWarnings("unchecked")
    public static <T extends Number> T addAndReturnSameType2(T num1, T num2) {
        return switch (num1) {
            case Integer intNum1 -> (T) Integer.valueOf(num1.intValue() + num2.intValue());
            case Double v -> (T) Double.valueOf(num1.doubleValue() + num2.doubleValue());
            case Float v -> (T) Float.valueOf(num1.floatValue() + num2.floatValue());
            case Long l -> (T) Long.valueOf(num1.longValue() + num2.longValue());
            case Short i -> (T) Short.valueOf((short) (num1.shortValue() + num2.shortValue()));
            case Byte b -> (T) Byte.valueOf((byte) (num1.byteValue() + num2.byteValue()));
            case null, default -> throw new IllegalArgumentException("Unsupported Number type: " + num1.getClass());
        };
    }

}
