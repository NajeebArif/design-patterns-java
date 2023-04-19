package narif.poc.designpatterns.composite;

public class Waitress {
    private final MenuComponent allMenuComponents;


    public Waitress(MenuComponent allMenuComponents) {
        this.allMenuComponents = allMenuComponents;
    }

    public void print(){
        allMenuComponents.print();
    }
}
