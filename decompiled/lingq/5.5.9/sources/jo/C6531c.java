package jo;

import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: renamed from: jo.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C6531c<E> extends AbstractList<E> implements RandomAccess {

    /* JADX INFO: renamed from: a */
    public int f37187a;

    /* JADX INFO: renamed from: b */
    public Object f37188b;

    /* JADX INFO: renamed from: jo.c$a */
    public static class a<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public static final a f37189a = new a();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.Iterator
        public final T next() {
            throw new NoSuchElementException();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.Iterator
        public final void remove() {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: jo.c$b */
    public class b extends c<E> {

        /* JADX INFO: renamed from: b */
        public final int f37190b;

        public b() {
            this.f37190b = ((AbstractList) C6531c.this).modCount;
        }

        @Override // jo.C6531c.c
        /* JADX INFO: renamed from: a */
        public final void mo13119a() {
            C6531c c6531c = C6531c.this;
            int i10 = ((AbstractList) c6531c).modCount;
            int i11 = this.f37190b;
            if (i10 == i11) {
                return;
            }
            throw new ConcurrentModificationException("ModCount: " + ((AbstractList) c6531c).modCount + "; expected: " + i11);
        }

        @Override // java.util.Iterator
        public final void remove() {
            mo13119a();
            C6531c.this.clear();
        }
    }

    /* JADX INFO: renamed from: jo.c$c */
    public static abstract class c<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public boolean f37192a;

        /* JADX INFO: renamed from: a */
        public abstract void mo13119a();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f37192a;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.Iterator
        public final T next() {
            if (this.f37192a) {
                throw new NoSuchElementException();
            }
            this.f37192a = true;
            mo13119a();
            return (T) C6531c.this.f37188b;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m13115a(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i10 == 2 || i10 == 3) {
            objArr[1] = "iterator";
        } else if (i10 == 5 || i10 == 6 || i10 == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6 && i10 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        int i11;
        if (i10 < 0 || i10 > (i11 = this.f37187a)) {
            StringBuilder sbM614j = C0141b.m614j("Index: ", i10, ", Size: ");
            sbM614j.append(this.f37187a);
            throw new IndexOutOfBoundsException(sbM614j.toString());
        }
        if (i11 == 0) {
            this.f37188b = e10;
        } else if (i11 == 1 && i10 == 0) {
            this.f37188b = new Object[]{e10, this.f37188b};
        } else {
            Object[] objArr = new Object[i11 + 1];
            if (i11 == 1) {
                objArr[0] = this.f37188b;
            } else {
                Object[] objArr2 = (Object[]) this.f37188b;
                System.arraycopy(objArr2, 0, objArr, 0, i10);
                System.arraycopy(objArr2, i10, objArr, i10 + 1, this.f37187a - i10);
            }
            objArr[i10] = e10;
            this.f37188b = objArr;
        }
        this.f37187a++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        int i10 = this.f37187a;
        if (i10 == 0) {
            this.f37188b = e10;
        } else if (i10 == 1) {
            this.f37188b = new Object[]{this.f37188b, e10};
        } else {
            Object[] objArr = (Object[]) this.f37188b;
            int length = objArr.length;
            if (i10 >= length) {
                int iM757a = C0166e.m757a(length, 3, 2, 1);
                int i11 = i10 + 1;
                if (iM757a < i11) {
                    iM757a = i11;
                }
                Object[] objArr2 = new Object[iM757a];
                this.f37188b = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f37187a] = e10;
        }
        this.f37187a++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f37188b = null;
        this.f37187a = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        int i11;
        if (i10 >= 0 && i10 < (i11 = this.f37187a)) {
            return i11 == 1 ? (E) this.f37188b : (E) ((Object[]) this.f37188b)[i10];
        }
        StringBuilder sbM614j = C0141b.m614j("Index: ", i10, ", Size: ");
        sbM614j.append(this.f37187a);
        throw new IndexOutOfBoundsException(sbM614j.toString());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        int i10 = this.f37187a;
        if (i10 == 0) {
            return a.f37189a;
        }
        if (i10 == 1) {
            return new b();
        }
        Iterator<E> it = super.iterator();
        if (it != null) {
            return it;
        }
        m13115a(3);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i10) {
        int i11;
        E e10;
        if (i10 < 0 || i10 >= (i11 = this.f37187a)) {
            StringBuilder sbM614j = C0141b.m614j("Index: ", i10, ", Size: ");
            sbM614j.append(this.f37187a);
            throw new IndexOutOfBoundsException(sbM614j.toString());
        }
        if (i11 == 1) {
            e10 = (E) this.f37188b;
            this.f37188b = null;
        } else {
            Object[] objArr = (Object[]) this.f37188b;
            Object obj = objArr[i10];
            if (i11 == 2) {
                this.f37188b = objArr[1 - i10];
            } else {
                int i12 = (i11 - i10) - 1;
                if (i12 > 0) {
                    System.arraycopy(objArr, i10 + 1, objArr, i10, i12);
                }
                objArr[this.f37187a - 1] = null;
            }
            e10 = (E) obj;
        }
        this.f37187a--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f37187a)) {
            StringBuilder sbM614j = C0141b.m614j("Index: ", i10, ", Size: ");
            sbM614j.append(this.f37187a);
            throw new IndexOutOfBoundsException(sbM614j.toString());
        }
        if (i11 == 1) {
            E e11 = (E) this.f37188b;
            this.f37188b = e10;
            return e11;
        }
        Object[] objArr = (Object[]) this.f37188b;
        E e12 = (E) objArr[i10];
        objArr[i10] = e10;
        return e12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37187a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        if (tArr == 0) {
            m13115a(4);
            throw null;
        }
        int length = tArr.length;
        int i10 = this.f37187a;
        if (i10 == 1) {
            if (length == 0) {
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
                tArr2[0] = this.f37188b;
                return tArr2;
            }
            tArr[0] = this.f37188b;
        } else {
            if (length < i10) {
                T[] tArr3 = (T[]) Arrays.copyOf((Object[]) this.f37188b, i10, tArr.getClass());
                if (tArr3 != null) {
                    return tArr3;
                }
                m13115a(6);
                throw null;
            }
            if (i10 != 0) {
                System.arraycopy(this.f37188b, 0, tArr, 0, i10);
            }
        }
        int i11 = this.f37187a;
        if (length > i11) {
            tArr[i11] = 0;
        }
        return tArr;
    }
}
