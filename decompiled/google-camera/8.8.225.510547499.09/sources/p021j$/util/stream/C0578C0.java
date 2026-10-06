package p021j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.C0 */
/* JADX INFO: loaded from: classes3.dex */
class C0578C0 extends AbstractC0581D0 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f33287c;

    /* JADX INFO: renamed from: d */
    private final Object f33288d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0578C0(InterfaceC0610N interfaceC0610N, Object obj) {
        this(interfaceC0610N, obj, 0);
        this.f33287c = 0;
    }

    @Override // p021j$.util.stream.AbstractC0581D0
    /* JADX INFO: renamed from: a */
    final void mo12609a() {
        switch (this.f33287c) {
            case 0:
                ((InterfaceC0610N) this.f33299a).mo12673y(this.f33300b, this.f33288d);
                break;
            default:
                this.f33299a.mo12603r((Object[]) this.f33288d, this.f33300b);
                break;
        }
    }

    @Override // p021j$.util.stream.AbstractC0581D0
    /* JADX INFO: renamed from: b */
    final C0578C0 mo12610b(int i, int i2) {
        switch (this.f33287c) {
            case 0:
                return new C0578C0(this, ((InterfaceC0610N) this.f33299a).mo12597c(i), i2);
            default:
                return new C0578C0(this, this.f33299a.mo12597c(i), i2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0578C0(InterfaceC0613O interfaceC0613O, Object obj, int i) {
        super(interfaceC0613O);
        this.f33287c = i;
        this.f33288d = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0578C0(InterfaceC0613O interfaceC0613O, Object[] objArr) {
        this(interfaceC0613O, objArr, 1);
        this.f33287c = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0578C0(C0578C0 c0578c0, InterfaceC0610N interfaceC0610N, int i) {
        super(c0578c0, interfaceC0610N, i);
        this.f33287c = 0;
        this.f33288d = c0578c0.f33288d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0578C0(C0578C0 c0578c0, InterfaceC0613O interfaceC0613O, int i) {
        super(c0578c0, interfaceC0613O, i);
        this.f33287c = 1;
        this.f33288d = (Object[]) c0578c0.f33288d;
    }
}
