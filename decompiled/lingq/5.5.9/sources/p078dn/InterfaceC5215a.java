package p078dn;

import dm.C5207g;
import gn.InterfaceC5834n;
import gn.InterfaceC5837q;
import gn.InterfaceC5842v;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import mn.C7648e;

/* JADX INFO: renamed from: dn.a */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5215a {

    /* JADX INFO: renamed from: dn.a$a */
    public static final class a implements InterfaceC5215a {

        /* JADX INFO: renamed from: a */
        public static final a f33295a = new a();

        @Override // p078dn.InterfaceC5215a
        /* JADX INFO: renamed from: a */
        public final Set<C7648e> mo11202a() {
            return EmptySet.f38034a;
        }

        @Override // p078dn.InterfaceC5215a
        /* JADX INFO: renamed from: b */
        public final InterfaceC5842v mo11203b(C7648e c7648e) {
            C5207g.m11111f(c7648e, "name");
            return null;
        }

        @Override // p078dn.InterfaceC5215a
        /* JADX INFO: renamed from: c */
        public final Set<C7648e> mo11204c() {
            return EmptySet.f38034a;
        }

        @Override // p078dn.InterfaceC5215a
        /* JADX INFO: renamed from: d */
        public final Collection mo11205d(C7648e c7648e) {
            C5207g.m11111f(c7648e, "name");
            return EmptyList.f38032a;
        }

        @Override // p078dn.InterfaceC5215a
        /* JADX INFO: renamed from: e */
        public final Set<C7648e> mo11206e() {
            return EmptySet.f38034a;
        }

        @Override // p078dn.InterfaceC5215a
        /* JADX INFO: renamed from: f */
        public final InterfaceC5834n mo11207f(C7648e c7648e) {
            C5207g.m11111f(c7648e, "name");
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    Set<C7648e> mo11202a();

    /* JADX INFO: renamed from: b */
    InterfaceC5842v mo11203b(C7648e c7648e);

    /* JADX INFO: renamed from: c */
    Set<C7648e> mo11204c();

    /* JADX INFO: renamed from: d */
    Collection<InterfaceC5837q> mo11205d(C7648e c7648e);

    /* JADX INFO: renamed from: e */
    Set<C7648e> mo11206e();

    /* JADX INFO: renamed from: f */
    InterfaceC5834n mo11207f(C7648e c7648e);
}
