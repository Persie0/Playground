package p000;

import java.util.Objects;

/* JADX INFO: renamed from: zy */
/* JADX INFO: loaded from: classes.dex */
public final class C3850zy {

    /* JADX INFO: renamed from: e */
    public static final C3850zy f72365e = new C3850zy(-1, -1, -1);

    /* JADX INFO: renamed from: a */
    public final int f72366a;

    /* JADX INFO: renamed from: b */
    public final int f72367b;

    /* JADX INFO: renamed from: c */
    public final int f72368c;

    /* JADX INFO: renamed from: d */
    public final int f72369d;

    public C3850zy(int i, int i2, int i3) {
        this.f72366a = i;
        this.f72367b = i2;
        this.f72368c = i3;
        this.f72369d = uma.m22830y(i3) ? uma.m22819n(i3) * i2 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3850zy)) {
            return false;
        }
        C3850zy c3850zy = (C3850zy) obj;
        return this.f72366a == c3850zy.f72366a && this.f72367b == c3850zy.f72367b && this.f72368c == c3850zy.f72368c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f72366a), Integer.valueOf(this.f72367b), Integer.valueOf(this.f72368c));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
        sb.append(this.f72366a);
        sb.append(", channelCount=");
        sb.append(this.f72367b);
        sb.append(", encoding=");
        return wq1.m24122r(sb, this.f72368c, ']');
    }
}
