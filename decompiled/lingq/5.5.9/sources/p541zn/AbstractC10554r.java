package p541zn;

import android.support.v4.media.session.C0166e;
import bo.InterfaceC1626d;
import dm.C5207g;
import kn.C6732b;
import kn.C6735e;
import kn.InterfaceC6733c;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import mn.C7645b;
import mn.C7646c;
import p260m8.C7499b;
import p372rm.InterfaceC8837f0;

/* JADX INFO: renamed from: zn.r */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC10554r {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6733c f52612a;

    /* JADX INFO: renamed from: b */
    public final C6735e f52613b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8837f0 f52614c;

    /* JADX INFO: renamed from: zn.r$a */
    public static final class a extends AbstractC10554r {

        /* JADX INFO: renamed from: d */
        public final ProtoBuf$Class f52615d;

        /* JADX INFO: renamed from: e */
        public final a f52616e;

        /* JADX INFO: renamed from: f */
        public final C7645b f52617f;

        /* JADX INFO: renamed from: g */
        public final ProtoBuf$Class.Kind f52618g;

        /* JADX INFO: renamed from: h */
        public final boolean f52619h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ProtoBuf$Class protoBuf$Class, InterfaceC6733c interfaceC6733c, C6735e c6735e, InterfaceC8837f0 interfaceC8837f0, a aVar) {
            super(interfaceC6733c, c6735e, interfaceC8837f0);
            C5207g.m11111f(protoBuf$Class, "classProto");
            C5207g.m11111f(interfaceC6733c, "nameResolver");
            C5207g.m11111f(c6735e, "typeTable");
            this.f52615d = protoBuf$Class;
            this.f52616e = aVar;
            this.f52617f = C7499b.m14896C(interfaceC6733c, protoBuf$Class.f39014e);
            ProtoBuf$Class.Kind kind = (ProtoBuf$Class.Kind) C6732b.f37968f.m13348c(protoBuf$Class.f39012d);
            this.f52618g = kind == null ? ProtoBuf$Class.Kind.CLASS : kind;
            this.f52619h = C0166e.m779z(C6732b.f37969g, protoBuf$Class.f39012d, "IS_INNER.get(classProto.flags)");
        }

        @Override // p541zn.AbstractC10554r
        /* JADX INFO: renamed from: a */
        public final C7646c mo19524a() {
            C7646c c7646cM15204b = this.f52617f.m15204b();
            C5207g.m11110e(c7646cM15204b, "classId.asSingleFqName()");
            return c7646cM15204b;
        }
    }

    /* JADX INFO: renamed from: zn.r$b */
    public static final class b extends AbstractC10554r {

        /* JADX INFO: renamed from: d */
        public final C7646c f52620d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C7646c c7646c, InterfaceC6733c interfaceC6733c, C6735e c6735e, InterfaceC1626d interfaceC1626d) {
            super(interfaceC6733c, c6735e, interfaceC1626d);
            C5207g.m11111f(c7646c, "fqName");
            C5207g.m11111f(interfaceC6733c, "nameResolver");
            C5207g.m11111f(c6735e, "typeTable");
            this.f52620d = c7646c;
        }

        @Override // p541zn.AbstractC10554r
        /* JADX INFO: renamed from: a */
        public final C7646c mo19524a() {
            return this.f52620d;
        }
    }

    public AbstractC10554r(InterfaceC6733c interfaceC6733c, C6735e c6735e, InterfaceC8837f0 interfaceC8837f0) {
        this.f52612a = interfaceC6733c;
        this.f52613b = c6735e;
        this.f52614c = interfaceC8837f0;
    }

    /* JADX INFO: renamed from: a */
    public abstract C7646c mo19524a();

    public final String toString() {
        return getClass().getSimpleName() + ": " + mo19524a();
    }
}
