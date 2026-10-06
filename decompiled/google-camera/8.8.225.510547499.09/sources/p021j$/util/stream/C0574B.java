package p021j$.util.stream;

import java.util.function.Consumer;
import java.util.function.Predicate;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.B */
/* JADX INFO: loaded from: classes3.dex */
final class C0574B implements InterfaceC0646Z0 {

    /* JADX INFO: renamed from: a */
    boolean f33278a;

    /* JADX INFO: renamed from: b */
    boolean f33279b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ EnumC0577C f33280c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ Predicate f33281d;

    C0574B(EnumC0577C enumC0577C, Predicate predicate) {
        this.f33280c = enumC0577C;
        this.f33281d = predicate;
        this.f33279b = !enumC0577C.f33286b;
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    public final /* synthetic */ void accept(int i) {
        AbstractC0586F.m12640b();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ void mo12598f() {
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ void mo12599h(long j) {
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: m */
    public final boolean mo12600m() {
        return this.f33278a;
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    public final /* synthetic */ void accept(long j) {
        AbstractC0586F.m12645g();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.f33278a) {
            return;
        }
        boolean zTest = this.f33281d.test(obj);
        EnumC0577C enumC0577C = this.f33280c;
        if (zTest == enumC0577C.f33285a) {
            this.f33278a = true;
            this.f33279b = enumC0577C.f33286b;
        }
    }
}
