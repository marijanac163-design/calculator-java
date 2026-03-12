# TEST-RESULTS - Calculator

## 1. Black-box testiranje (sistemsko / prihvatljivost)

| Test slučaj | Ulaz | Očekivani izlaz | Rezultat | Napomena |
|-------------|------|-----------------|----------|----------|
| Jednostavna sabiranja | 4+5 | 9 | 9 | OK |
| Kombinacija operacija | 10+5*4+3 | 33 | 33 | OK |
| Deljenje nulom | 5/0 | greška / exception | Izuzetak nije uhvaćen | Propust: treba dodati proveru deljenja nulom |
| Nepoznat znak | 5&2 | greška / exception | Izuzetak nije uhvaćen | Propust: nepoznat operator nije obrađen |
| Višestruki operatori | 5 ++ 2 | greška / exception | Izuzetak | OK |
| Negativni brojevi | -5+3 | -2 | -2 | OK |
| Decimale | 3.5+2.1 | 5.6 | 5 | Propust: kalkulator koristi int tipove, decimale nisu podržane |
| Prazan unos | "" | greška / exception | Izuzetak | OK |
| Razmak između brojeva i operatora | 4 + 5 | 9 | Izuzetak | Propust: razmaci nisu obrađeni, parser ne ignoriše whitespace |

---

## 2. Jedinični testovi (Unit Testing)

- **testCalculateSimpleExpression** – uspešno, rezultat 10+5*4+3 = 33  
- **testCalculateDivisionByZero** – očekivani `ArithmeticException` uhvaćen  

---

## 3. Zaključci

- Kalkulator pravilno obrađuje jednostavne izraze i poštuje prioritet operacija.  
- Potrebno je dodati validaciju ulaza za:  
  - deljenje nulom  
  - nepoznate operatore  
  - prazne stringove  
  - razmake i formate sa decimalnim brojevima  
- Preporučuje se proširenje jediničnih testova kako bi se pokrili svi kritični slučajevi, uključujući:  
  - negativne brojeve  
  - decimalne brojeve  
  - kombinovane izraze sa više operatora
