public class xRunner {

    public static void main(String[] args) {

        House K132 = new House();

        K132.addRoom("hall");
        K132.addRoom("bathroom");

        System.out.println( K132.gotoRoom("hall") );
        System.out.println( K132 );

        K132.gotoRoom("hall").addRoomItem(RoomItemType.LIGHT, "RoofLamp");
        K132.gotoRoom("bathroom").addRoomItem(RoomItemType.LIGHT, "RoofLamp")
                .addRoomItem(RoomItemType.LIGHT, "MirrorLamp")
                .addRoomItem(RoomItemType.HEATING, "WarmFloor")
                .addRoomItem(RoomItemType.VENTILATION, "Fan")
                .addRoomItem(RoomItemType.HUMIDITY_SENSOR,"H1")
                .addRoomItem(RoomItemType.TEMPERATURE_SENSOR,"T1");

        K132.addRoom("livingroom");
        K132.gotoRoom("livingroom").addRoomItem(RoomItemType.LIGHT,"BigBohemiaGlassLamp")
                .addRoomItem(RoomItemType.HEATING,"WarmFloor")
                .addRoomItem(RoomItemType.WINDOW,"LeftWindow")
                .addRoomItem(RoomItemType.WINDOW,"RightWindow")
                .addRoomItem(RoomItemType.TEMPERATURE_SENSOR,"T1");

        System.out.println( K132 );

        System.out.println( K132.changeRoomName("hall","corridor") );
        System.out.println( K132 );

        System.out.println( K132.gotoRoom("bathroom").takeItem("H1") );
        System.out.println( K132.gotoRoom("bathroom").takeItem("T1") );
        System.out.println( K132.gotoRoom("corridor").takeItem("RoofLamp") );

    }

}