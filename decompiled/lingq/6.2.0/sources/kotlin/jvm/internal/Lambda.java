package kotlin.jvm.internal;

import java.io.Serializable;
import p000.ij3;
import p000.y38;
import p000.z38;

/* JADX INFO: loaded from: classes.dex */
public abstract class Lambda<R> implements ij3, Serializable {

    /* JADX INFO: renamed from: a */
    public final int f47711a;

    public Lambda(int i) {
        this.f47711a = i;
    }

    @Override // p000.ij3
    public final int getArity() {
        return this.f47711a;
    }

    public final String toString() {
        y38.f69246a.getClass();
        return z38.m25425a(this);
    }
}
