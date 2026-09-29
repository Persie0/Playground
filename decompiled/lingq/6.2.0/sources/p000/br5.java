package p000;

/* JADX INFO: loaded from: classes.dex */
public final class br5 extends AbstractC3816z0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ dr5 f8888a;

    public br5(dr5 dr5Var) {
        this.f8888a = dr5Var;
    }

    @Override // p000.AbstractC3778y, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // p000.AbstractC3778y
    /* JADX INFO: renamed from: d */
    public final int mo3718d() {
        return this.f8888a.f36077a.groupCount() + 1;
    }

    @Override // java.util.List
    public final Object get(int i) {
        String strGroup = this.f8888a.f36077a.group(i);
        return strGroup == null ? "" : strGroup;
    }

    @Override // p000.AbstractC3816z0, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // p000.AbstractC3816z0, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }
}
