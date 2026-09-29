package p267n0;

import androidx.compose.runtime.snapshots.SnapshotIdSet;
import androidx.compose.runtime.snapshots.SnapshotKt;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import sl.C9072e;

/* JADX INFO: renamed from: n0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7671b extends C7670a {

    /* JADX INFO: renamed from: l */
    public final C7670a f42158l;

    /* JADX INFO: renamed from: m */
    public boolean f42159m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7671b(int i10, SnapshotIdSet snapshotIdSet, InterfaceC2052l<Object, C9072e> interfaceC2052l, InterfaceC2052l<Object, C9072e> interfaceC2052l2, C7670a c7670a) {
        super(i10, snapshotIdSet, interfaceC2052l, interfaceC2052l2);
        C5207g.m11111f(snapshotIdSet, "invalid");
        C5207g.m11111f(c7670a, "parent");
        this.f42158l = c7670a;
        c7670a.mo1867j(this);
    }

    @Override // p267n0.C7670a, androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: c */
    public final void mo1866c() {
        if (!this.f3314c) {
            super.mo1866c();
            if (!this.f42159m) {
                this.f42159m = true;
                this.f42158l.mo1868k(this);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p267n0.C7670a
    /* JADX INFO: renamed from: t */
    public final AbstractC7674e mo1871t() {
        C7670a c7670a = this.f42158l;
        if (!c7670a.f42157k && !c7670a.f3314c) {
            Set<InterfaceC7690u> set = this.f42153g;
            int i10 = this.f3313b;
            HashMap mapM1884c = set != null ? SnapshotKt.m1884c(c7670a, this, c7670a.mo1919e()) : null;
            Object obj = SnapshotKt.f3262c;
            synchronized (obj) {
                SnapshotKt.m1885d(this);
                if (set == null || set.size() == 0) {
                    m1916a();
                } else {
                    AbstractC7674e abstractC7674eM15271v = m15271v(this.f42158l.mo1918d(), mapM1884c, this.f42158l.mo1919e());
                    if (!C5207g.m11106a(abstractC7674eM15271v, AbstractC7674e.b.f42162a)) {
                        return abstractC7674eM15271v;
                    }
                    Set<InterfaceC7690u> setMo15270u = this.f42158l.mo15270u();
                    Set set2 = setMo15270u;
                    if (setMo15270u == null) {
                        HashSet hashSet = new HashSet();
                        this.f42158l.mo15273x(hashSet);
                        set2 = hashSet;
                    }
                    set2.addAll(set);
                }
                if (this.f42158l.mo1918d() < i10) {
                    this.f42158l.m15269s();
                }
                C7670a c7670a2 = this.f42158l;
                c7670a2.mo1923q(c7670a2.mo1919e().m1878f(i10).m1877a(this.f42154h));
                this.f42158l.m15272w(i10);
                C7670a c7670a3 = this.f42158l;
                int i11 = this.f3315d;
                this.f3315d = -1;
                if (i11 >= 0) {
                    int[] iArr = c7670a3.f42155i;
                    C5207g.m11111f(iArr, "<this>");
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i11;
                    c7670a3.f42155i = iArrCopyOf;
                } else {
                    c7670a3.getClass();
                }
                C7670a c7670a4 = this.f42158l;
                SnapshotIdSet snapshotIdSet = this.f42154h;
                c7670a4.getClass();
                C5207g.m11111f(snapshotIdSet, "snapshots");
                synchronized (obj) {
                    c7670a4.f42154h = c7670a4.f42154h.m1880i(snapshotIdSet);
                    C9072e c9072e = C9072e.f47360a;
                    C7670a c7670a5 = this.f42158l;
                    int[] iArr2 = this.f42155i;
                    c7670a5.getClass();
                    C5207g.m11111f(iArr2, "handles");
                    if (!(iArr2.length == 0)) {
                        int[] iArr3 = c7670a5.f42155i;
                        if (iArr3.length == 0) {
                            c7670a5.f42155i = iArr2;
                        } else {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            C5207g.m11110e(iArrCopyOf2, "result");
                            c7670a5.f42155i = iArrCopyOf2;
                        }
                    }
                }
                this.f42157k = true;
                if (!this.f42159m) {
                    this.f42159m = true;
                    this.f42158l.mo1868k(this);
                }
                return AbstractC7674e.b.f42162a;
            }
        }
        return new AbstractC7674e.a(this);
    }
}
