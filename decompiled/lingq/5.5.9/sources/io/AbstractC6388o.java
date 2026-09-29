package io;

import android.support.v4.media.C0141b;
import dm.C5207g;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;

/* JADX INFO: renamed from: io.o */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6388o implements InterfaceC6378e {

    /* JADX INFO: renamed from: a */
    public final String f36815a;

    /* JADX INFO: renamed from: io.o$a */
    public static final class a extends AbstractC6388o {

        /* JADX INFO: renamed from: b */
        public final int f36816b;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(int i10) {
            StringBuilder sbM614j = C0141b.m614j("must have at least ", i10, " value parameter");
            sbM614j.append(i10 > 1 ? "s" : "");
            super(sbM614j.toString());
            this.f36816b = i10;
        }

        @Override // io.InterfaceC6378e
        /* JADX INFO: renamed from: c */
        public final boolean mo13011c(InterfaceC6822c interfaceC6822c) {
            C5207g.m11111f(interfaceC6822c, "functionDescriptor");
            return interfaceC6822c.mo11889i().size() >= this.f36816b;
        }
    }

    /* JADX INFO: renamed from: io.o$b */
    public static final class b extends AbstractC6388o {

        /* JADX INFO: renamed from: b */
        public final int f36817b;

        public b() {
            super("must have exactly 2 value parameters");
            this.f36817b = 2;
        }

        @Override // io.InterfaceC6378e
        /* JADX INFO: renamed from: c */
        public final boolean mo13011c(InterfaceC6822c interfaceC6822c) {
            C5207g.m11111f(interfaceC6822c, "functionDescriptor");
            return interfaceC6822c.mo11889i().size() == this.f36817b;
        }
    }

    /* JADX INFO: renamed from: io.o$c */
    public static final class c extends AbstractC6388o {

        /* JADX INFO: renamed from: b */
        public static final c f36818b = new c();

        public c() {
            super("must have no value parameters");
        }

        @Override // io.InterfaceC6378e
        /* JADX INFO: renamed from: c */
        public final boolean mo13011c(InterfaceC6822c interfaceC6822c) {
            C5207g.m11111f(interfaceC6822c, "functionDescriptor");
            return interfaceC6822c.mo11889i().isEmpty();
        }
    }

    /* JADX INFO: renamed from: io.o$d */
    public static final class d extends AbstractC6388o {

        /* JADX INFO: renamed from: b */
        public static final d f36819b = new d();

        public d() {
            super("must have a single value parameter");
        }

        @Override // io.InterfaceC6378e
        /* JADX INFO: renamed from: c */
        public final boolean mo13011c(InterfaceC6822c interfaceC6822c) {
            C5207g.m11111f(interfaceC6822c, "functionDescriptor");
            return interfaceC6822c.mo11889i().size() == 1;
        }
    }

    public AbstractC6388o(String str) {
        this.f36815a = str;
    }

    @Override // io.InterfaceC6378e
    /* JADX INFO: renamed from: a */
    public final String mo13009a(InterfaceC6822c interfaceC6822c) {
        return InterfaceC6378e.a.m13012a(this, interfaceC6822c);
    }

    @Override // io.InterfaceC6378e
    /* JADX INFO: renamed from: b */
    public final String mo13010b() {
        return this.f36815a;
    }
}
