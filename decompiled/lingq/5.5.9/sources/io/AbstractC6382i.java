package io;

import dm.C5207g;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;

/* JADX INFO: renamed from: io.i */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6382i implements InterfaceC6378e {

    /* JADX INFO: renamed from: a */
    public final String f36785a;

    /* JADX INFO: renamed from: io.i$a */
    public static final class a extends AbstractC6382i {

        /* JADX INFO: renamed from: b */
        public static final a f36786b = new a();

        public a() {
            super("must be a member function");
        }

        @Override // io.InterfaceC6378e
        /* JADX INFO: renamed from: c */
        public final boolean mo13011c(InterfaceC6822c interfaceC6822c) {
            C5207g.m11111f(interfaceC6822c, "functionDescriptor");
            return interfaceC6822c.mo11892m0() != null;
        }
    }

    /* JADX INFO: renamed from: io.i$b */
    public static final class b extends AbstractC6382i {

        /* JADX INFO: renamed from: b */
        public static final b f36787b = new b();

        public b() {
            super("must be a member or an extension function");
        }

        @Override // io.InterfaceC6378e
        /* JADX INFO: renamed from: c */
        public final boolean mo13011c(InterfaceC6822c interfaceC6822c) {
            C5207g.m11111f(interfaceC6822c, "functionDescriptor");
            return (interfaceC6822c.mo11892m0() == null && interfaceC6822c.mo11896s0() == null) ? false : true;
        }
    }

    public AbstractC6382i(String str) {
        this.f36785a = str;
    }

    @Override // io.InterfaceC6378e
    /* JADX INFO: renamed from: a */
    public final String mo13009a(InterfaceC6822c interfaceC6822c) {
        return InterfaceC6378e.a.m13012a(this, interfaceC6822c);
    }

    @Override // io.InterfaceC6378e
    /* JADX INFO: renamed from: b */
    public final String mo13010b() {
        return this.f36785a;
    }
}
