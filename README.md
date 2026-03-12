# Izveštaj o softverskom pregledu i metrike

## 1. LOC metrike

Ukupan broj linija koda: 85

| Fajl | Broj linija koda |
|------|-----------------|
| Calculator.java | 50 |
| Start.java | 35 |

---

## 2. Neformalni pregled i statička analiza

| Fajl | Broj linija koda | Zapažanje / Code Smell |
|------|-----------------|------------------------|
| Calculator.java | 50 | Metode za aritmetičke operacije su kratke i čitljive. Nedostaju komentari za javne metode. Metoda divide ne proverava deljenje nulom. |
| Start.java | 35 | Kod za pokretanje kalkulatora je jednostavan, ali ulaz korisnika nije validiran. Moguća greška pri unosu nula ili nevalidnog znaka. |
