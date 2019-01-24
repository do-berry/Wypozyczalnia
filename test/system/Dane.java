/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;
//import system.Operacja;

import java.util.Date;
import wypozyczalnia.Film;
import wypozyczalnia.ProfilKlienta;
/**
 *
 * @author USER
 */
public class Dane {
    
    public String daneDoFilmow[][] = {{"0", "film0", "studio0", "rezyser0", "gatunek0", "nosnik0"}, {"1", "film1", "studio1", "rezyser1", "gatunek1", "nosnik1"}, {"2", "film2", "studio2", "rezyser2", "gatunek2", "nosnik2"}};
    public String daneDoKlientow[][]={{"000","imie0", "nazwisko0", "email0", "adres0"}, {"111","imie1", "nazwisko1", "email1", "adres1"}, {"2","imie2", "nazwisko2", "email2", "adres2"}, {"3","imie3", "nazwisko3", "email3", "adres3"}, {"4","imie4", "nazwisko4", "email4", "adres4"}, {"555","imie5", "nazwisko5", "email5", "adres5"}};
    public Film daneFilmy[] = {new Film(daneDoFilmow[0]),new Film(daneDoFilmow[1]), new Film(daneDoFilmow[2]) };
    public ProfilKlienta daneKlienci[] = {new ProfilKlienta(daneDoKlientow[0]),new ProfilKlienta(daneDoKlientow[1]), new ProfilKlienta(daneDoKlientow[2]), new ProfilKlienta(daneDoKlientow[3]), new ProfilKlienta(daneDoKlientow[4]), new ProfilKlienta(daneDoKlientow[5])};
    public Date daneDaty[] = {new Date(12, 10, 11), new Date(19, 10, 11), new Date(12, 12, 11), new Date(13, 1, 11), new Date(13, 2, 11), new Date(13, 3, 11), new Date(13, 4, 11),new Date(13, 14, 11)};
    public Egzemplarz daneEgzemplarze[] = {new Egzemplarz(0, daneFilmy[0]),new Egzemplarz(1, daneFilmy[0]),new Egzemplarz(2, daneFilmy[1]),new Egzemplarz(3, daneFilmy[1]),new Egzemplarz(4, daneFilmy[2]),new Egzemplarz(5, daneFilmy[2]) };
    public Operacja daneOperacje[] = {new Operacja(daneDaty[0], daneEgzemplarze[0]), new Operacja(daneDaty[0], daneEgzemplarze[1]), new Operacja(daneDaty[0], daneEgzemplarze[2]), new Operacja(daneDaty[1], daneEgzemplarze[0]), new Operacja(daneDaty[2], daneEgzemplarze[1]), new Operacja(daneDaty[3], daneEgzemplarze[2]), new Operacja(daneDaty[4], daneEgzemplarze[4])};
}
