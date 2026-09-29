package com.google.android.exoplayer2.audio;

import androidx.datastore.preferences.PreferencesProto$Value;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2372f implements DefaultAudioSink.InterfaceC2359d {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.f$a */
    public static class a {
    }

    public C2372f(a aVar) {
    }

    /* JADX INFO: renamed from: a */
    public static int m6861a(int i10) {
        switch (i10) {
            case 5:
                return 80000;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case 18:
                return 768000;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            case 19:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
            case 20:
                return 63750;
        }
    }
}
