package p000;

import androidx.compose.runtime.AbstractC0279g;

/* JADX INFO: loaded from: classes.dex */
public final class k77 extends o77 {

    /* JADX INFO: renamed from: g */
    public l77 f46817g;

    @Override // p000.o77, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC0279g) {
            return super.containsKey((AbstractC0279g) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof aoa) {
            return super.containsValue((aoa) obj);
        }
        return false;
    }

    @Override // p000.o77
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final l77 mo14938b() {
        yba ybaVar = this.f53938c;
        l77 l77Var = this.f46817g;
        if (ybaVar != l77Var.f50733a) {
            this.f53937b = new u06(13);
            l77Var = new l77(this.f53938c, this.f53941f);
        }
        this.f46817g = l77Var;
        return l77Var;
    }

    @Override // p000.o77, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC0279g) {
            return (aoa) super.get((AbstractC0279g) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC0279g) ? obj2 : (aoa) super.getOrDefault((AbstractC0279g) obj, (aoa) obj2);
    }

    @Override // p000.o77, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof AbstractC0279g) {
            return (aoa) super.remove((AbstractC0279g) obj);
        }
        return null;
    }
}
