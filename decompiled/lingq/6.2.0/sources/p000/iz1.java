package p000;

import com.lingq.core.domain.model.language.DailyStreakPreset;

/* JADX INFO: loaded from: classes2.dex */
public final class iz1 implements jz1 {

    /* JADX INFO: renamed from: a */
    public final DailyStreakPreset f44794a;

    /* JADX INFO: renamed from: b */
    public final String f44795b;

    public iz1(DailyStreakPreset dailyStreakPreset) {
        dailyStreakPreset.getClass();
        this.f44794a = dailyStreakPreset;
        this.f44795b = dailyStreakPreset.getIntensity();
    }

    @Override // p000.jz1
    /* JADX INFO: renamed from: a */
    public final Integer mo13592a() {
        return null;
    }

    @Override // p000.jz1
    /* JADX INFO: renamed from: b */
    public final String mo13593b() {
        return this.f44795b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iz1) && this.f44794a == ((iz1) obj).f44794a;
    }

    public final int hashCode() {
        return this.f44794a.hashCode();
    }

    public final String toString() {
        return "Preset(preset=" + this.f44794a + ")";
    }
}
