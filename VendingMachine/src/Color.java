public enum Color implements Printer{
    RED("FF0000"),
    Green("00FF00"),
    Blue("0000FF");

    private String rgb;
    private Color(String rgb){
        this.rgb = rgb;
    }


    @Override
    public void print() {
        System.out.println("rgb : " + rgb );
    }
}
