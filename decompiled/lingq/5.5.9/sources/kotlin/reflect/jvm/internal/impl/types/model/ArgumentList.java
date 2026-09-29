package kotlin.reflect.jvm.internal.impl.types.model;

import java.util.ArrayList;
import p139go.InterfaceC5854h;
import p139go.InterfaceC5855i;

/* JADX INFO: loaded from: classes2.dex */
public final class ArgumentList extends ArrayList<InterfaceC5855i> implements InterfaceC5854h {
    public ArgumentList(int i10) {
        super(i10);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof InterfaceC5855i) {
            return super.contains((InterfaceC5855i) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof InterfaceC5855i) {
            return super.indexOf((InterfaceC5855i) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof InterfaceC5855i) {
            return super.lastIndexOf((InterfaceC5855i) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof InterfaceC5855i) {
            return super.remove((InterfaceC5855i) obj);
        }
        return false;
    }
}
