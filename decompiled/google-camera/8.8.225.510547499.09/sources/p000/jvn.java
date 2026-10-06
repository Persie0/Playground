package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jvn {

    /* JADX INFO: renamed from: e */
    private static final jvl f34899e = jvl.f34892a;

    /* JADX INFO: renamed from: a */
    public final int f34900a;

    /* JADX INFO: renamed from: b */
    public final String f34901b;

    /* JADX INFO: renamed from: c */
    public final int f34902c;

    /* JADX INFO: renamed from: d */
    public final boolean f34903d;

    /* JADX INFO: renamed from: f */
    private final jvl f34904f;

    public jvn() {
    }

    public jvn(int i, String str, int i2, boolean z, jvl jvlVar) {
        this.f34900a = i;
        this.f34901b = str;
        this.f34902c = i2;
        this.f34903d = z;
        this.f34904f = jvlVar;
    }

    /* JADX INFO: renamed from: a */
    public static jvm m13583a() {
        jvm jvmVar = new jvm();
        jvmVar.f34896d = f34899e;
        jvmVar.m13581b(0);
        jvmVar.f34894b = true;
        jvmVar.f34895c = (byte) (jvmVar.f34895c | 4);
        return jvmVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jvn) {
            jvn jvnVar = (jvn) obj;
            if (this.f34900a == jvnVar.f34900a && this.f34901b.equals(jvnVar.f34901b) && this.f34902c == jvnVar.f34902c && this.f34903d == jvnVar.f34903d && this.f34904f.equals(jvnVar.f34904f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f34900a ^ 1000003) * 1000003) ^ this.f34901b.hashCode()) * 1000003) ^ this.f34902c) * 1000003) ^ (true != this.f34903d ? 1237 : 1231)) * 1000003) ^ this.f34904f.hashCode();
    }

    public final String toString() {
        return "NamedExecutorOptions{threadCount=" + this.f34900a + ", name=" + this.f34901b + ", androidThreadPriority=" + this.f34902c + ", propagateErrors=" + this.f34903d + ", threadBodyDecorator=" + String.valueOf(this.f34904f) + "}";
    }
}
