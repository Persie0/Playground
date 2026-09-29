package p000;

import java.util.List;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class yx8 implements SerialDescriptor, rl0 {

    /* JADX INFO: renamed from: a */
    public final SerialDescriptor f70618a;

    /* JADX INFO: renamed from: b */
    public final String f70619b;

    /* JADX INFO: renamed from: c */
    public final Set f70620c;

    public yx8(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        this.f70618a = serialDescriptor;
        this.f70619b = serialDescriptor.mo3694a() + '?';
        this.f70620c = eh0.m11129i(serialDescriptor);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: a */
    public final String mo3694a() {
        return this.f70619b;
    }

    @Override // p000.rl0
    /* JADX INFO: renamed from: b */
    public final Set mo3695b() {
        return this.f70620c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: c */
    public final boolean mo11826c() {
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: d */
    public final int mo3696d(String str) {
        str.getClass();
        return this.f70618a.mo3696d(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: e */
    public final int mo3697e() {
        return this.f70618a.mo3697e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yx8) {
            return fa4.m11650l(this.f70618a, ((yx8) obj).f70618a);
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: f */
    public final String mo3698f(int i) {
        return this.f70618a.mo3698f(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: g */
    public final boolean mo10855g() {
        return this.f70618a.mo10855g();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.f70618a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC3184kh getKind() {
        return this.f70618a.getKind();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: h */
    public final List mo3699h(int i) {
        return this.f70618a.mo3699h(i);
    }

    public final int hashCode() {
        return this.f70618a.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: i */
    public final SerialDescriptor mo3700i(int i) {
        return this.f70618a.mo3700i(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: j */
    public final boolean mo3701j(int i) {
        return this.f70618a.mo3701j(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f70618a);
        sb.append('?');
        return sb.toString();
    }
}
