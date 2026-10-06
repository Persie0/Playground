package p000;

import com.google.android.libraries.lens.lenslite.dynamicloading.DLEngineApi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kwq {

    /* JADX INFO: renamed from: a */
    public final DLEngineApi f37524a;

    /* JADX INFO: renamed from: b */
    public final String f37525b;

    public kwq(DLEngineApi dLEngineApi, String str) {
        if (dLEngineApi == null) {
            throw new NullPointerException("Null dlEngineApi");
        }
        this.f37524a = dLEngineApi;
        if (str == null) {
            throw new NullPointerException("Null hostPackageName");
        }
        this.f37525b = str;
    }

    /* JADX INFO: renamed from: a */
    public static kwq m14948a(DLEngineApi dLEngineApi, String str) {
        return new kwq(dLEngineApi, str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kwq) {
            kwq kwqVar = (kwq) obj;
            if (this.f37524a.equals(kwqVar.f37524a) && this.f37525b.equals(kwqVar.f37525b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f37524a.hashCode() ^ 1000003) * 1000003) ^ this.f37525b.hashCode();
    }

    public final String toString() {
        return "EngineApiBundle{dlEngineApi=" + this.f37524a.toString() + ", hostPackageName=" + this.f37525b + "}";
    }

    public kwq() {
    }
}
