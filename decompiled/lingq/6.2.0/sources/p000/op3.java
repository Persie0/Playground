package p000;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class op3 extends AbstractList {

    /* JADX INFO: renamed from: e */
    public static final AtomicInteger f54675e = new AtomicInteger();

    /* JADX INFO: renamed from: a */
    public Handler f54676a;

    /* JADX INFO: renamed from: c */
    public final ArrayList f54678c;

    /* JADX INFO: renamed from: b */
    public final String f54677b = String.valueOf(Integer.valueOf(f54675e.incrementAndGet()));

    /* JADX INFO: renamed from: d */
    public final ArrayList f54679d = new ArrayList();

    public op3(mp3... mp3VarArr) {
        List listAsList = Arrays.asList(mp3VarArr);
        listAsList.getClass();
        this.f54678c = new ArrayList(listAsList);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        mp3 mp3Var = (mp3) obj;
        mp3Var.getClass();
        return this.f54678c.add(mp3Var);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f54678c.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof mp3) {
            return super.contains((mp3) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (mp3) this.f54678c.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof mp3) {
            return super.indexOf((mp3) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof mp3) {
            return super.lastIndexOf((mp3) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof mp3) {
            return super.remove((mp3) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        mp3 mp3Var = (mp3) obj;
        mp3Var.getClass();
        return (mp3) this.f54678c.set(i, mp3Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f54678c.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        mp3 mp3Var = (mp3) obj;
        mp3Var.getClass();
        this.f54678c.add(i, mp3Var);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return (mp3) this.f54678c.remove(i);
    }

    public op3(Collection collection) {
        this.f54678c = new ArrayList(collection);
    }
}
