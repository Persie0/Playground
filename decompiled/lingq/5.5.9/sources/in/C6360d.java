package in;

import ae.C0062b;
import dm.C5207g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C6752c;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C6829c;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import mn.C7645b;
import mn.C7648e;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8853n0;
import p372rm.InterfaceC8863u;
import p373rn.AbstractC8875g;
import p373rn.AbstractC8878j;
import p373rn.C8869a;
import p373rn.C8874f;
import p373rn.C8877i;
import p373rn.C8883o;
import p465wm.C9974d;
import p541zn.C10539c;
import p543do.AbstractC5257t;
import sm.InterfaceC9075c;

/* JADX INFO: renamed from: in.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C6360d extends AbstractBinaryClassAnnotationAndConstantLoader<InterfaceC9075c, AbstractC8875g<?>> {

    /* JADX INFO: renamed from: c */
    public final InterfaceC8863u f36720c;

    /* JADX INFO: renamed from: d */
    public final NotFoundClasses f36721d;

    /* JADX INFO: renamed from: e */
    public final C10539c f36722e;

    /* JADX INFO: renamed from: in.d$a */
    public abstract class a implements InterfaceC6367k.a {

        /* JADX INFO: renamed from: in.d$a$a, reason: collision with other inner class name */
        public static final class C10637a implements InterfaceC6367k.b {

            /* JADX INFO: renamed from: a */
            public final ArrayList<AbstractC8875g<?>> f36724a = new ArrayList<>();

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C6360d f36725b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C7648e f36726c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ a f36727d;

            /* JADX INFO: renamed from: in.d$a$a$a, reason: collision with other inner class name */
            public static final class C10638a implements InterfaceC6367k.a {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC6367k.a f36728a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC6367k.a f36729b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ C10637a f36730c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ ArrayList<InterfaceC9075c> f36731d;

                public C10638a(C6361e c6361e, C10637a c10637a, ArrayList arrayList) {
                    this.f36729b = c6361e;
                    this.f36730c = c10637a;
                    this.f36731d = arrayList;
                    this.f36728a = c6361e;
                }

                @Override // in.InterfaceC6367k.a
                /* JADX INFO: renamed from: a */
                public final void mo12974a() {
                    this.f36729b.mo12974a();
                    this.f36730c.f36724a.add(new C8869a((InterfaceC9075c) C6752c.m13443k0(this.f36731d)));
                }

                @Override // in.InterfaceC6367k.a
                /* JADX INFO: renamed from: b */
                public final void mo12975b(C7648e c7648e, C8874f c8874f) {
                    this.f36728a.mo12975b(c7648e, c8874f);
                }

                @Override // in.InterfaceC6367k.a
                /* JADX INFO: renamed from: c */
                public final InterfaceC6367k.b mo12976c(C7648e c7648e) {
                    return this.f36728a.mo12976c(c7648e);
                }

                @Override // in.InterfaceC6367k.a
                /* JADX INFO: renamed from: d */
                public final void mo12977d(C7648e c7648e, C7645b c7645b, C7648e c7648e2) {
                    this.f36728a.mo12977d(c7648e, c7645b, c7648e2);
                }

                @Override // in.InterfaceC6367k.a
                /* JADX INFO: renamed from: e */
                public final void mo12978e(Object obj, C7648e c7648e) {
                    this.f36728a.mo12978e(obj, c7648e);
                }

                @Override // in.InterfaceC6367k.a
                /* JADX INFO: renamed from: f */
                public final InterfaceC6367k.a mo12979f(C7645b c7645b, C7648e c7648e) {
                    return this.f36728a.mo12979f(c7645b, c7648e);
                }
            }

            public C10637a(C6360d c6360d, C7648e c7648e, a aVar) {
                this.f36725b = c6360d;
                this.f36726c = c7648e;
                this.f36727d = aVar;
            }

            @Override // in.InterfaceC6367k.b
            /* JADX INFO: renamed from: a */
            public final void mo12983a() {
                ArrayList<AbstractC8875g<?>> arrayList = this.f36724a;
                C6361e c6361e = (C6361e) this.f36727d;
                c6361e.getClass();
                C5207g.m11111f(arrayList, "elements");
                C7648e c7648e = this.f36726c;
                if (c7648e == null) {
                    return;
                }
                InterfaceC8853n0 interfaceC8853n0M322X0 = C0062b.m322X0(c7648e, c6361e.f36734d);
                if (interfaceC8853n0M322X0 != null) {
                    HashMap<C7648e, AbstractC8875g<?>> map = c6361e.f36732b;
                    List listM397t0 = C0062b.m397t0(arrayList);
                    AbstractC5257t abstractC5257tMo11884c = interfaceC8853n0M322X0.mo11884c();
                    C5207g.m11110e(abstractC5257tMo11884c, "parameter.type");
                    map.put(c7648e, ConstantValueFactory.m14100a(listM397t0, abstractC5257tMo11884c));
                    return;
                }
                if (c6361e.f36733c.m13764r(c6361e.f36735e) && C5207g.m11106a(c7648e.m15235f(), "value")) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<AbstractC8875g<?>> it = arrayList.iterator();
                    loop0: while (true) {
                        while (true) {
                            if (!it.hasNext()) {
                                break loop0;
                            }
                            AbstractC8875g<?> next = it.next();
                            if (next instanceof C8869a) {
                                arrayList2.add(next);
                            }
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        c6361e.f36736f.add((InterfaceC9075c) ((C8869a) it2.next()).f46772a);
                    }
                }
            }

            @Override // in.InterfaceC6367k.b
            /* JADX INFO: renamed from: b */
            public final void mo12984b(C7645b c7645b, C7648e c7648e) {
                this.f36724a.add(new C8877i(c7645b, c7648e));
            }

            @Override // in.InterfaceC6367k.b
            /* JADX INFO: renamed from: c */
            public final InterfaceC6367k.a mo12985c(C7645b c7645b) {
                ArrayList arrayList = new ArrayList();
                return new C10638a(this.f36725b.mo12981s(c7645b, InterfaceC8837f0.f46730a, arrayList), this, arrayList);
            }

            @Override // in.InterfaceC6367k.b
            /* JADX INFO: renamed from: d */
            public final void mo12986d(C8874f c8874f) {
                this.f36724a.add(new C8883o(c8874f));
            }

            @Override // in.InterfaceC6367k.b
            /* JADX INFO: renamed from: e */
            public final void mo12987e(Object obj) {
                this.f36724a.add(C6360d.m12980w(this.f36725b, this.f36726c, obj));
            }
        }

        public a() {
        }

        @Override // in.InterfaceC6367k.a
        /* JADX INFO: renamed from: b */
        public final void mo12975b(C7648e c7648e, C8874f c8874f) {
            ((C6361e) this).f36732b.put(c7648e, new C8883o(c8874f));
        }

        @Override // in.InterfaceC6367k.a
        /* JADX INFO: renamed from: c */
        public final InterfaceC6367k.b mo12976c(C7648e c7648e) {
            return new C10637a(C6360d.this, c7648e, this);
        }

        @Override // in.InterfaceC6367k.a
        /* JADX INFO: renamed from: d */
        public final void mo12977d(C7648e c7648e, C7645b c7645b, C7648e c7648e2) {
            ((C6361e) this).f36732b.put(c7648e, new C8877i(c7645b, c7648e2));
        }

        @Override // in.InterfaceC6367k.a
        /* JADX INFO: renamed from: e */
        public final void mo12978e(Object obj, C7648e c7648e) {
            ((C6361e) this).f36732b.put(c7648e, C6360d.m12980w(C6360d.this, c7648e, obj));
        }

        @Override // in.InterfaceC6367k.a
        /* JADX INFO: renamed from: f */
        public final InterfaceC6367k.a mo12979f(C7645b c7645b, C7648e c7648e) {
            ArrayList arrayList = new ArrayList();
            return new C6359c(C6360d.this.mo12981s(c7645b, InterfaceC8837f0.f46730a, arrayList), this, c7648e, arrayList);
        }

        /* JADX INFO: renamed from: g */
        public abstract void mo12982g(C7648e c7648e, AbstractC8875g<?> abstractC8875g);
    }

    public C6360d(C6829c c6829c, NotFoundClasses notFoundClasses, LockBasedStorageManager lockBasedStorageManager, C9974d c9974d) {
        super(lockBasedStorageManager, c9974d);
        this.f36720c = c6829c;
        this.f36721d = notFoundClasses;
        this.f36722e = new C10539c(c6829c, notFoundClasses);
    }

    /* JADX INFO: renamed from: w */
    public static final AbstractC8875g m12980w(C6360d c6360d, C7648e c7648e, Object obj) {
        c6360d.getClass();
        AbstractC8875g abstractC8875gM14102c = ConstantValueFactory.m14102c(obj);
        if (abstractC8875gM14102c == null) {
            String str = "Unsupported annotation argument: " + c7648e;
            C5207g.m11111f(str, "message");
            abstractC8875gM14102c = new AbstractC8878j.a(str);
        }
        return abstractC8875gM14102c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    /* JADX INFO: renamed from: s */
    public final C6361e mo12981s(C7645b c7645b, InterfaceC8837f0 interfaceC8837f0, List list) {
        C5207g.m11111f(list, "result");
        return new C6361e(this, FindClassInModuleKt.m13586c(this.f36720c, c7645b, this.f36721d), c7645b, list, interfaceC8837f0);
    }
}
