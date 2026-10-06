package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class att {

    /* JADX INFO: renamed from: a */
    final C1117xf f2378a;

    /* JADX INFO: renamed from: b */
    final C1117xf f2379b;

    /* JADX INFO: renamed from: c */
    final C1117xf f2380c;

    /* JADX INFO: renamed from: d */
    public final Parcel f2381d;

    /* JADX INFO: renamed from: e */
    private final SparseIntArray f2382e;

    /* JADX INFO: renamed from: f */
    private final int f2383f;

    /* JADX INFO: renamed from: g */
    private final int f2384g;

    /* JADX INFO: renamed from: h */
    private final String f2385h;

    /* JADX INFO: renamed from: i */
    private int f2386i;

    /* JADX INFO: renamed from: j */
    private int f2387j;

    /* JADX INFO: renamed from: k */
    private int f2388k;

    public att(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C1117xf(), new C1117xf(), new C1117xf());
    }

    /* JADX INFO: renamed from: v */
    private final Class m1992v(Class cls) throws ClassNotFoundException {
        Class cls2 = (Class) this.f2380c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f2380c.put(cls.getName(), cls3);
        return cls3;
    }

    /* JADX INFO: renamed from: a */
    public final int m1993a(int i, int i2) {
        return !m2011s(i2) ? i : this.f2381d.readInt();
    }

    /* JADX INFO: renamed from: b */
    public final Parcelable m1994b(Parcelable parcelable, int i) {
        if (!m2011s(i)) {
            return parcelable;
        }
        return this.f2381d.readParcelable(getClass().getClassLoader());
    }

    /* JADX INFO: renamed from: c */
    public final atu m1995c() {
        String strM2006n = m2006n();
        if (strM2006n == null) {
            return null;
        }
        att attVarM2005m = m2005m();
        try {
            Method declaredMethod = (Method) this.f2378a.get(strM2006n);
            if (declaredMethod == null) {
                declaredMethod = Class.forName(strM2006n, true, att.class.getClassLoader()).getDeclaredMethod("read", att.class);
                this.f2378a.put(strM2006n, declaredMethod);
            }
            return (atu) declaredMethod.invoke(null, attVarM2005m);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(e4);
        }
    }

    /* JADX INFO: renamed from: d */
    public final CharSequence m1996d(CharSequence charSequence, int i) {
        return !m2011s(i) ? charSequence : (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f2381d);
    }

    /* JADX INFO: renamed from: e */
    public final String m1997e(String str, int i) {
        return !m2011s(i) ? str : m2006n();
    }

    /* JADX INFO: renamed from: f */
    public final void m1998f(boolean z, int i) {
        m2008p(i);
        this.f2381d.writeInt(z ? 1 : 0);
    }

    /* JADX INFO: renamed from: g */
    public final void m1999g(CharSequence charSequence, int i) {
        m2008p(i);
        TextUtils.writeToParcel(charSequence, this.f2381d, 0);
    }

    /* JADX INFO: renamed from: h */
    public final void m2000h(int i, int i2) {
        m2008p(i2);
        m2009q(i);
    }

    /* JADX INFO: renamed from: i */
    public final void m2001i(Parcelable parcelable, int i) {
        m2008p(i);
        this.f2381d.writeParcelable(parcelable, 0);
    }

    /* JADX INFO: renamed from: j */
    public final void m2002j(String str, int i) {
        m2008p(i);
        m2010r(str);
    }

    /* JADX INFO: renamed from: k */
    public final void m2003k(atu atuVar) {
        if (atuVar == null) {
            m2010r(null);
            return;
        }
        try {
            m2010r(m1992v(atuVar.getClass()).getName());
            att attVarM2005m = m2005m();
            try {
                Class<?> cls = atuVar.getClass();
                Method declaredMethod = (Method) this.f2379b.get(cls.getName());
                if (declaredMethod == null) {
                    declaredMethod = m1992v(cls).getDeclaredMethod("write", cls, att.class);
                    this.f2379b.put(cls.getName(), declaredMethod);
                }
                declaredMethod.invoke(null, atuVar, attVarM2005m);
                attVarM2005m.m2007o();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException(e3);
            } catch (InvocationTargetException e4) {
                Throwable cause = e4.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (!(cause instanceof Error)) {
                    throw new RuntimeException(e4);
                }
                throw ((Error) cause);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(String.valueOf(atuVar.getClass().getSimpleName()).concat(" does not have a Parcelizer"), e5);
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m2004l(boolean z, int i) {
        if (m2011s(i)) {
            return this.f2381d.readInt() != 0;
        }
        return z;
    }

    /* JADX INFO: renamed from: m */
    protected final att m2005m() {
        Parcel parcel = this.f2381d;
        int iDataPosition = parcel.dataPosition();
        int i = this.f2387j;
        if (i == this.f2383f) {
            i = this.f2384g;
        }
        int i2 = i;
        String str = this.f2385h;
        return new att(parcel, iDataPosition, i2, str.concat("  "), this.f2378a, this.f2379b, this.f2380c);
    }

    /* JADX INFO: renamed from: n */
    public final String m2006n() {
        return this.f2381d.readString();
    }

    /* JADX INFO: renamed from: o */
    public final void m2007o() {
        int i = this.f2386i;
        if (i >= 0) {
            int i2 = this.f2382e.get(i);
            int iDataPosition = this.f2381d.dataPosition();
            this.f2381d.setDataPosition(i2);
            this.f2381d.writeInt(iDataPosition - i2);
            this.f2381d.setDataPosition(iDataPosition);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m2008p(int i) {
        m2007o();
        this.f2386i = i;
        this.f2382e.put(i, this.f2381d.dataPosition());
        m2009q(0);
        m2009q(i);
    }

    /* JADX INFO: renamed from: q */
    public final void m2009q(int i) {
        this.f2381d.writeInt(i);
    }

    /* JADX INFO: renamed from: r */
    public final void m2010r(String str) {
        this.f2381d.writeString(str);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m2011s(int i) {
        while (this.f2387j < this.f2384g) {
            int i2 = this.f2388k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f2381d.setDataPosition(this.f2387j);
            int i3 = this.f2381d.readInt();
            this.f2388k = this.f2381d.readInt();
            this.f2387j += i3;
        }
        return this.f2388k == i;
    }

    /* JADX INFO: renamed from: t */
    public final atu m2012t(atu atuVar) {
        return !m2011s(1) ? atuVar : m1995c();
    }

    /* JADX INFO: renamed from: u */
    public final void m2013u(atu atuVar) {
        m2008p(1);
        m2003k(atuVar);
    }

    private att(Parcel parcel, int i, int i2, String str, C1117xf c1117xf, C1117xf c1117xf2, C1117xf c1117xf3) {
        this.f2378a = c1117xf;
        this.f2379b = c1117xf2;
        this.f2380c = c1117xf3;
        this.f2382e = new SparseIntArray();
        this.f2386i = -1;
        this.f2388k = -1;
        this.f2381d = parcel;
        this.f2383f = i;
        this.f2384g = i2;
        this.f2387j = i;
        this.f2385h = str;
    }
}
