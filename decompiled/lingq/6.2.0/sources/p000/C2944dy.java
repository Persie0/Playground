package p000;

import com.lingq.core.domain.model.audio.AudioFetchErrorType;

/* JADX INFO: renamed from: dy */
/* JADX INFO: loaded from: classes3.dex */
public final class C2944dy implements InterfaceC3055gy {

    /* JADX INFO: renamed from: a */
    public final int f36410a;

    /* JADX INFO: renamed from: b */
    public final String f36411b;

    /* JADX INFO: renamed from: c */
    public final AudioFetchErrorType f36412c;

    public C2944dy(int i, String str, AudioFetchErrorType audioFetchErrorType) {
        str.getClass();
        audioFetchErrorType.getClass();
        this.f36410a = i;
        this.f36411b = str;
        this.f36412c = audioFetchErrorType;
    }

    @Override // p000.InterfaceC3055gy
    /* JADX INFO: renamed from: a */
    public final int mo3115a() {
        return this.f36410a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2944dy)) {
            return false;
        }
        C2944dy c2944dy = (C2944dy) obj;
        return this.f36410a == c2944dy.f36410a && fa4.m11650l(this.f36411b, c2944dy.f36411b) && this.f36412c == c2944dy.f36412c;
    }

    public final int hashCode() {
        return this.f36412c.hashCode() + ux5.m22980c(Integer.hashCode(this.f36410a) * 31, this.f36411b, 31);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f36410a, "Error(lessonId=", ", language=", this.f36411b, ", errorType=");
        sbM22995r.append(this.f36412c);
        sbM22995r.append(")");
        return sbM22995r.toString();
    }
}
