package p000;

import android.graphics.Typeface;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class kym {

    /* JADX INFO: renamed from: a */
    public final int f37733a;

    /* JADX INFO: renamed from: b */
    public final Object f37734b;

    public kym(int i) {
        this.f37733a = i;
        this.f37734b = new ConcurrentLinkedQueue();
    }

    public kym(int i, byte[] bArr) {
        this.f37734b = null;
        this.f37733a = i;
    }

    public kym(Typeface typeface) {
        this.f37734b = typeface;
        this.f37733a = 0;
    }

    public kym(Object obj, int i) {
        this.f37734b = obj;
        this.f37733a = i;
    }

    public kym(String str, int i) {
        this.f37734b = str;
        this.f37733a = i;
    }

    public kym(jcu jcuVar, int i) {
        jib.m13205j(jcuVar);
        this.f37734b = jcuVar;
        this.f37733a = i;
    }

    public kym(mrm mrmVar, int i) {
        this.f37734b = mrmVar;
        this.f37733a = i;
    }

    public kym(mrm mrmVar) {
        this(mrmVar, 0);
    }
}
