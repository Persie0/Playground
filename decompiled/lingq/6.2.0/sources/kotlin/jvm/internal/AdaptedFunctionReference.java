package kotlin.jvm.internal;

import java.io.Serializable;
import p000.fa4;
import p000.ij3;
import p000.ux5;
import p000.y38;
import p000.z38;

/* JADX INFO: loaded from: classes.dex */
public class AdaptedFunctionReference implements ij3, Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f47695a;

    /* JADX INFO: renamed from: b */
    public final Class f47696b;

    /* JADX INFO: renamed from: c */
    public final String f47697c;

    /* JADX INFO: renamed from: d */
    public final String f47698d;

    /* JADX INFO: renamed from: e */
    public final boolean f47699e = false;

    /* JADX INFO: renamed from: f */
    public final int f47700f;

    /* JADX INFO: renamed from: g */
    public final int f47701g;

    public AdaptedFunctionReference(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.f47695a = obj;
        this.f47696b = cls;
        this.f47697c = str;
        this.f47698d = str2;
        this.f47700f = i;
        this.f47701g = i2 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdaptedFunctionReference)) {
            return false;
        }
        AdaptedFunctionReference adaptedFunctionReference = (AdaptedFunctionReference) obj;
        return this.f47699e == adaptedFunctionReference.f47699e && this.f47700f == adaptedFunctionReference.f47700f && this.f47701g == adaptedFunctionReference.f47701g && fa4.m11650l(this.f47695a, adaptedFunctionReference.f47695a) && this.f47696b.equals(adaptedFunctionReference.f47696b) && this.f47697c.equals(adaptedFunctionReference.f47697c) && this.f47698d.equals(adaptedFunctionReference.f47698d);
    }

    @Override // p000.ij3
    public final int getArity() {
        return this.f47700f;
    }

    public final int hashCode() {
        Object obj = this.f47695a;
        return ((((ux5.m22980c(ux5.m22980c((this.f47696b.hashCode() + ((obj != null ? obj.hashCode() : 0) * 31)) * 31, this.f47697c, 31), this.f47698d, 31) + (this.f47699e ? 1231 : 1237)) * 31) + this.f47700f) * 31) + this.f47701g;
    }

    public final String toString() {
        y38.f69246a.getClass();
        return z38.m25425a(this);
    }
}
