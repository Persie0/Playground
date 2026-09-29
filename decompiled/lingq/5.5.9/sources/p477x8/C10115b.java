package p477x8;

import android.content.Context;
import p003a2.C0009a;
import p113f9.InterfaceC5478a;

/* JADX INFO: renamed from: x8.b */
/* JADX INFO: loaded from: classes.dex */
public final class C10115b extends AbstractC10119f {

    /* JADX INFO: renamed from: a */
    public final Context f51291a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5478a f51292b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5478a f51293c;

    /* JADX INFO: renamed from: d */
    public final String f51294d;

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    public C10115b(Context context, InterfaceC5478a interfaceC5478a, InterfaceC5478a interfaceC5478a2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f51291a = context;
        if (interfaceC5478a == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f51292b = interfaceC5478a;
        if (interfaceC5478a2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f51293c = interfaceC5478a2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f51294d = str;
    }

    @Override // p477x8.AbstractC10119f
    /* JADX INFO: renamed from: a */
    public final Context mo18975a() {
        return this.f51291a;
    }

    @Override // p477x8.AbstractC10119f
    /* JADX INFO: renamed from: b */
    public final String mo18976b() {
        return this.f51294d;
    }

    @Override // p477x8.AbstractC10119f
    /* JADX INFO: renamed from: c */
    public final InterfaceC5478a mo18977c() {
        return this.f51293c;
    }

    @Override // p477x8.AbstractC10119f
    /* JADX INFO: renamed from: d */
    public final InterfaceC5478a mo18978d() {
        return this.f51292b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC10119f)) {
            return false;
        }
        AbstractC10119f abstractC10119f = (AbstractC10119f) obj;
        return this.f51291a.equals(abstractC10119f.mo18975a()) && this.f51292b.equals(abstractC10119f.mo18978d()) && this.f51293c.equals(abstractC10119f.mo18977c()) && this.f51294d.equals(abstractC10119f.mo18976b());
    }

    public final int hashCode() {
        return ((((((this.f51291a.hashCode() ^ 1000003) * 1000003) ^ this.f51292b.hashCode()) * 1000003) ^ this.f51293c.hashCode()) * 1000003) ^ this.f51294d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f51291a);
        sb2.append(", wallClock=");
        sb2.append(this.f51292b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f51293c);
        sb2.append(", backendName=");
        return C0009a.m23l(sb2, this.f51294d, "}");
    }
}
