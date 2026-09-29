package p000;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class gf4 implements SerialDescriptor {

    /* JADX INFO: renamed from: b */
    public static final gf4 f40703b = new gf4();

    /* JADX INFO: renamed from: c */
    public static final String f40704c = "kotlinx.serialization.json.JsonArray";

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2941dv f40705a;

    public gf4() {
        SerialDescriptor descriptor = vf4.f65313a.getDescriptor();
        descriptor.getClass();
        this.f40705a = new C2941dv(descriptor);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: a */
    public final String mo3694a() {
        return f40704c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: c */
    public final boolean mo11826c() {
        this.f40705a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: d */
    public final int mo3696d(String str) {
        str.getClass();
        return this.f40705a.mo3696d(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: e */
    public final int mo3697e() {
        this.f40705a.getClass();
        return 1;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: f */
    public final String mo3698f(int i) {
        this.f40705a.getClass();
        return String.valueOf(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: g */
    public final boolean mo10855g() {
        this.f40705a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        this.f40705a.getClass();
        return EmptyList.f47638a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC3184kh getKind() {
        this.f40705a.getClass();
        return hl9.f42586z;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: h */
    public final List mo3699h(int i) {
        this.f40705a.mo3699h(i);
        return EmptyList.f47638a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: i */
    public final SerialDescriptor mo3700i(int i) {
        return this.f40705a.mo3700i(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: j */
    public final boolean mo3701j(int i) {
        this.f40705a.mo3701j(i);
        return false;
    }
}
