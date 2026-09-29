package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ue9 {

    /* JADX INFO: renamed from: a */
    public final Map f63813a;

    public ue9(Map map) {
        map.getClass();
        this.f63813a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ue9) && fa4.m11650l(this.f63813a, ((ue9) obj).f63813a);
    }

    public final int hashCode() {
        return this.f63813a.hashCode();
    }

    public final String toString() {
        return "SpeakingData(autoplayTTS=" + this.f63813a + ")";
    }
}
