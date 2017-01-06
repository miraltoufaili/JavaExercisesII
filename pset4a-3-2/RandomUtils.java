class RandomUtils
{

    public static int randomInt(int a, int b)
    {
        return a + (int) ((b - a + 1) * Math.random());
    }

}