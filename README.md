### Video av parprogrammering

https://www.youtube.com/watch?v=MF539kfCKrk




### Eksempel på bruk
### Run main metod in Program class

```cmd
Please enter a number you want to convert to Roman number
387
The roman value of 387 is CCCLXXXVII

```


# Innlevering 1: Programmeringsferdigheter

## Oppgave

Lag et program som kan skrive ut tall som [romertall](https://no.wikipedia.org/wiki/Romertall). Programmet skal fungere med enhetstester og skal også kunne ta imot et input fra brukeren.

### Eksempel på bruk

```cmd
> mvn package
> java -classpath target/classes no.kristiania.RomanNumbers

Vennligst slik skriv inn ett tall:
>200
200 er CC
```

## Innlevering

Innleveringen skal leveres på Canvas med link til GitHub-repository. Begge skal levere i Canvas (med link til samme repository).

Dere skal ta opp en screencast på 4-7 minutter der dere parprogrammerer med remote eller lokal ping-pong stil: en person skriver den første testen og ser den kjøre rødt; gir over kontrollen til den andre som får testen til å passere, refactorerer og skriver neste teste før første utvikler igjen skal få denne testen til å passere

Det anbefales at dere bruker Discord og Github for remote parprogrammering og tar opp sesjonen med Screencast-o-matic, men andre verktøy kan benyttes. Husk å åpne for tilgang til videoen ("unlisted" i Youtube) og legge inn lenke fra README.md.

<link til video av parprogrammering>

## Krav til innlevering

* Innlevering
  * [ ] Begge har levert link til Github Repository i Canvas
  * [ ] Dere har lastet opp zip-fil på Canvas
  * [x] Koden er sjekket inn på et repository på https://github.com/kristiania-pgr203-2021
  * [x] GitHub repository er private. Dere skal gi tilgang til de som gir code review
* Github
  * [x] Dere har en Git branch som viser parprogrammering der dere sjekker inn annenhver gang
  * [ ] Dere har mottatt code review fra medstudenter
  * [x] `.idea`, `*.iml` og `target` er lagt til i .gitignore og ikke sjekket inn
  * [x] Github Actions rapporterer at 100% av testene kjører grønt
  * [x] GitHub Actions skal ha `timeout` på bygget
  * [x] Dere har opprettet og resolved GitHub issues med link til commits
* Kode
  * [x] Koden skal være korrekt strukturert etter Maven sine standarder (koden skal ligge under `src/main/java` og tester under `src/test/java`)
  * [x] Klassene skal ligge i Java packages
  * [x] Koden inneholder en testklasse med 4-7 testmetoder
  * [x] Klassenavn, pakkenavn, metodenavn og variabelnavn skal følge Java-konvensjoner når det gjelder små og store bokstaver
  * [x] Koden skal være korrekt indentert
  * [x] Koden kan oversette alle romertall fra 1-3999 (fra I til MMMCMXCIX)
* README-fil
  * [x] Link til video av parprogrammering
  * [ ] Korrekt GitHub Actions status badge
  * [x] Eksempel på bruk
* Video av parprogrammering viser:
  * [x] Den som skriver en test gir koden til den andre for å få testen til å passere
  * [x] Begge skriver tester og begger får tester til å passere
  * [x] Dere gjør en liten refactoring med Ctrl-alt-shift-t (Windows)/ctrl-t (Mac)
