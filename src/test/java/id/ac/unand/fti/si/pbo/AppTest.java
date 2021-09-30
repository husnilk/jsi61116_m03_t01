package id.ac.unand.fti.si.pbo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AppTest 
{
    @Test
    public void testNamaPropertyAvailable(){
        try {
			Class<?> pelangganClass = Class.forName("id.ac.unand.fti.si.pbo.Pelanggan");			
			pelangganClass.getField("nama");
		}catch(NoSuchFieldException e) {
			assertTrue(false, "Property nama tidak ditemukan");
		}catch(ClassNotFoundException e) {
			assertTrue(false, "Kelas Pelanggan tidak ditemukan");
		}
    }

    @Test
    public void testNoIdPropertyAvailable(){
        try {
			Class<?> pelangganClass = Class.forName("id.ac.unand.fti.si.pbo.Pelanggan");
			pelangganClass.getField("noId");
		}catch(NoSuchFieldException e) {
			assertTrue(false, "Property noId tidak ditemukan");
		}catch(ClassNotFoundException e) {
			assertTrue(false, "Kelas Pelanggan tidak ditemukan");
		}
    }

    @Test
    public void testNoHPPropertyAvailable(){
        try {
			Class<?> pelangganClass = Class.forName("id.ac.unand.fti.si.pbo.Pelanggan");
			pelangganClass.getField("noHP");
		}catch(NoSuchFieldException e) {
			assertTrue(false, "Property noHP tidak ditemukan");
		}catch(ClassNotFoundException e) {
			assertTrue(false, "Kelas Pelanggan tidak ditemukan");
		}
    }

    @Test
    public void testEmailPropertyAvailable(){
        try {
			Class<?> pelangganClass = Class.forName("id.ac.unand.fti.si.pbo.Pelanggan");
			pelangganClass.getField("email");
		}catch(NoSuchFieldException e) {
			assertTrue(false, "Property email tidak ditemukan");
		}catch(ClassNotFoundException e) {
			assertTrue(false, "Kelas Pelanggan tidak ditemukan");
		}
    }

    @Test
    public void testStatusPropertyAvailable(){
        try {
			Class<?> pelangganClass = Class.forName("id.ac.unand.fti.si.pbo.Pelanggan");
			pelangganClass.getField("status");
		}catch(NoSuchFieldException e) {
			assertTrue(false, "Property status tidak ditemukan");
		}catch(ClassNotFoundException e) {
			assertTrue(false, "Kelas Pelanggan tidak ditemukan");
		}
    }

    @Test
    public void testDeactivateMethodAvailable(){
        try {
			Class<?> pelangganClass = Class.forName("id.ac.unand.fti.si.pbo.Pelanggan");
			pelangganClass.getMethod("deactivate");

            Pelanggan pelanggan = new Pelanggan();
            pelanggan.deactivate();
            assertEquals(0, (int) pelanggan.status);

		}catch(NoSuchMethodException e) {
			assertTrue(false, "Method deactivate tidak ditemukan");
		}catch(ClassNotFoundException e) {
			assertTrue(false, "Kelas Pelanggan tidak ditemukan");
		}
    }

    @Test
    public void testUpdateEmailMethodAvailable(){
        try {
			Class<?> pelangganClass = Class.forName("id.ac.unand.fti.si.pbo.Pelanggan");
            Class<?>[] parameters = {String.class}; 
			pelangganClass.getMethod("updateEmail", parameters);
            
            Pelanggan pelanggan = new Pelanggan();
            pelanggan.updateEmail("me@server.com");
            assertEquals("me@server.com", pelanggan.email);

		}catch(NoSuchMethodException e) {
			assertTrue(false, "Method updateEmail tidak ditemukan");
		}catch(ClassNotFoundException e) {
			assertTrue(false, "Kelas Pelanggan tidak ditemukan");
		}
    }

    @Test
    public void testUpdateHpMethodAvailable(){
        try {
			Class<?> pelangganClass = Class.forName("id.ac.unand.fti.si.pbo.Pelanggan");
            Class<?>[] parameters = {String.class}; 
			pelangganClass.getMethod("updateNoHp", parameters);
            
            Pelanggan pelanggan = new Pelanggan();
            pelanggan.updateNoHp("+628393938");
            assertEquals("+628393938", pelanggan.noHP);
		}catch(NoSuchMethodException e) {
			assertTrue(false, "method UpdateNoHP tidak ditemukan");
		}catch(ClassNotFoundException e) {
			assertTrue(false, "Kelas Pelanggan tidak ditemukan");
		}
    }


}
