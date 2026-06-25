# VibeStudio 🎬✨

App Android nativa (Kotlin + Jetpack Compose) per **editare foto e video**, applicare preset/filtri "hits 2026", suggerire **trend, slang e hashtag del momento** (da sorgente aggiornabile), esportare nei formati ottimizzati per ogni social e **pubblicare** tramite le API ufficiali delle piattaforme.

> ⚠️ Nessuna app può *garantire* la viralità. VibeStudio fornisce gli strumenti che massimizzano le probabilità: formati corretti per piattaforma, hook nei primi secondi, caption/hashtag di tendenza aggiornabili, audio trend. Il resto è contenuto + timing.

---

## Stack tecnico

| Area | Tecnologia |
|------|-----------|
| Linguaggio | Kotlin |
| UI | Jetpack Compose + Material 3 |
| Architettura | MVVM + Clean (data / domain / ui) |
| DI | Hilt |
| Async | Coroutines + Flow |
| Editing video | AndroidX **Media3 (Transformer/Effects)** |
| Editing foto | GPU shader (GPUImage) + Coil |
| Networking | Retrofit + OkHttp + kotlinx.serialization |
| Storage locale | Room + DataStore |
| Trend remoti | Endpoint JSON aggiornabile (Retrofit) |
| Pubblicazione | Instagram Graph API · TikTok Content Posting API · YouTube Data API |

---

## Struttura del progetto

```
app/
 └─ src/main/java/com/vibestudio/
     ├─ VibeApp.kt                 # Application + Hilt
     ├─ MainActivity.kt           # host Compose + navigation
     ├─ core/                     # tema, util, formati social
     ├─ data/                     # repository, API, modelli remoti
     ├─ domain/                   # use case, modelli di dominio
     └─ ui/
         ├─ home/                 # galleria + import
         ├─ editor/photo/         # editor foto
         ├─ editor/video/         # editor video
         ├─ trends/               # pannello trend/slang/hashtag
         ├─ export/               # esportazione per formato
         └─ publish/              # pubblicazione social
```

---

## Configurazione

1. Apri il progetto in **Android Studio** (Koala+ consigliato).
2. Copia `secrets.defaults.properties` → `secrets.properties` e inserisci le tue chiavi social (vedi `docs/SOCIAL_SETUP.md`).
3. Sync Gradle ed esegui su un dispositivo/emulatore con **Android 8.0 (API 26)+**.

## Roadmap moduli

- [x] Scaffold + navigazione + tema
- [x] Galleria / import media
- [x] Pipeline trend (sorgente JSON remota)
- [x] Editor foto (filtri + preset)
- [ ] Editor video (taglio, audio, testo) — Media3 Transformer
- [ ] OAuth + publishing reale per piattaforma
