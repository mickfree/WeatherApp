import javax.swing.*;

public class AppLauncher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // display  the weather app gui
                new WeatherApp().setVisible(true);

//                System.out.println(WeatherAppBack.getWeatherData("Canada"));
//                System.out.println(WeatherAppBack.getCurrentTime());

            }
        });
    }
}
