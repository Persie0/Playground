package p000;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class wf4 implements SerialDescriptor {

    /* JADX INFO: renamed from: a */
    public final cs4 f66754a;

    public wf4(ui3 ui3Var) {
        this.f66754a = AbstractC3192a.m15356a(ui3Var);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: a */
    public final String mo3694a() {
        return m23893b().mo3694a();
    }

    /* JADX INFO: renamed from: b */
    public final SerialDescriptor m23893b() {
        return (SerialDescriptor) this.f66754a.getValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: d */
    public final int mo3696d(String str) {
        str.getClass();
        return m23893b().mo3696d(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: e */
    public final int mo3697e() {
        return m23893b().mo3697e();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: f */
    public final String mo3698f(int i) {
        return m23893b().mo3698f(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC3184kh getKind() {
        return m23893b().getKind();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: h */
    public final List mo3699h(int i) {
        return m23893b().mo3699h(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: i */
    public final SerialDescriptor mo3700i(int i) {
        return m23893b().mo3700i(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: j */
    public final boolean mo3701j(int i) {
        return m23893b().mo3701j(i);
    }
}
