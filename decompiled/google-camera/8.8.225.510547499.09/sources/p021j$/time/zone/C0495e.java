package p021j$.time.zone;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: j$.time.zone.e */
/* JADX INFO: loaded from: classes3.dex */
final class C0495e implements PrivilegedAction {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ List f33105a;

    C0495e(ArrayList arrayList) {
        this.f33105a = arrayList;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        String property = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if (property == null) {
            AbstractC0497g.m12498d(new C0496f());
            return null;
        }
        try {
            AbstractC0497g abstractC0497g = (AbstractC0497g) AbstractC0497g.class.cast(Class.forName(property, true, AbstractC0497g.class.getClassLoader()).newInstance());
            AbstractC0497g.m12498d(abstractC0497g);
            this.f33105a.add(abstractC0497g);
            return null;
        } catch (Exception e) {
            throw new Error(e);
        }
    }
}
