abstract class Gift{

    abstract void buy();
    abstract void give(String name);

}

class Postcard extends Gift{
    private String wish = "";

    public void writeWish(String wish){
        this.wish = wish;
    }

    public String getWish(){
        return this.wish;
    }

    @Override
    public void give(String name){
        System.out.println(this.wish + ", " + name);
    }

    @Override
    public void buy(){
        System.out.println("Вы купили открытку с поздравлением!");
    }
}

class Painting extends Gift{
    private String title;
    private String author;

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return this.author;
    }

    @Override
    public void buy(){
        System.out.println("Вы купили картину \"" + this.title + "\"; " + this.author);
    }

    @Override
    public void give(String name){
        System.out.println(name + ", не стесняйтесь, выбирайте!");
    }
}

class GiftExample{
    public static void main(String[] args){
        Postcard post = new Postcard();
        post.writeWish("Всего плохого");
        System.out.println(post.getWish());
        post.give("не могу придумать!");
        post.buy();
        System.out.println();

        Painting paint = new Painting();
        paint.setTitle("Лунный свет в полдень");
        paint.setAuthor("Автор неизвестен");
        System.out.println("Картина: " + paint.getTitle());
        System.out.println("Автор: " + paint.getAuthor());
        paint.give("Дорогой");
        paint.buy();
        System.out.println();

        Gift gift = new Gift(){

            @Override
            public void buy(){
                System.out.println("Вы купили подарок!");
            }

            @Override
            public void give(String name){
                System.out.println(name + ", пора выбрать подарок!");
            }
        };

        gift.give("Эй, слышь");
        gift.buy();

    }
}