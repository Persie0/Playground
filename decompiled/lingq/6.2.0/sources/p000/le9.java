package p000;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class le9 extends SpannableStringBuilder {

    /* JADX INFO: renamed from: a */
    public final Class f49561a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f49562b;

    public le9(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f49562b = new ArrayList();
        xwc.m24776n(cls, "watcherClass cannot be null");
        this.f49561a = cls;
    }

    /* JADX INFO: renamed from: a */
    public final void m16146a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f49562b;
            if (i >= arrayList.size()) {
                return;
            }
            ((ke9) arrayList.get(i)).f47112b.incrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m16147b() {
        m16150e();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f49562b;
            if (i >= arrayList.size()) {
                return;
            }
            ((ke9) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final ke9 m16148c(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f49562b;
            if (i >= arrayList.size()) {
                return null;
            }
            ke9 ke9Var = (ke9) arrayList.get(i);
            if (ke9Var.f47111a == obj) {
                return ke9Var;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m16149d(Object obj) {
        if (obj != null) {
            return this.f49561a == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final void m16150e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f49562b;
            if (i >= arrayList.size()) {
                return;
            }
            ((ke9) arrayList.get(i)).f47112b.decrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        ke9 ke9VarM16148c;
        if (m16149d(obj) && (ke9VarM16148c = m16148c(obj)) != null) {
            obj = ke9VarM16148c;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        ke9 ke9VarM16148c;
        if (m16149d(obj) && (ke9VarM16148c = m16148c(obj)) != null) {
            obj = ke9VarM16148c;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        ke9 ke9VarM16148c;
        if (m16149d(obj) && (ke9VarM16148c = m16148c(obj)) != null) {
            obj = ke9VarM16148c;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        if (this.f49561a != cls) {
            return super.getSpans(i, i2, cls);
        }
        ke9[] ke9VarArr = (ke9[]) super.getSpans(i, i2, ke9.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, ke9VarArr.length);
        for (int i3 = 0; i3 < ke9VarArr.length; i3++) {
            objArr[i3] = ke9VarArr[i3].f47111a;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        if (cls == null || this.f49561a == cls) {
            cls = ke9.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        ke9 ke9VarM16148c;
        if (m16149d(obj)) {
            ke9VarM16148c = m16148c(obj);
            if (ke9VarM16148c != null) {
                obj = ke9VarM16148c;
            }
        } else {
            ke9VarM16148c = null;
        }
        super.removeSpan(obj);
        if (ke9VarM16148c != null) {
            this.f49562b.remove(ke9VarM16148c);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        m16146a();
        super.replace(i, i2, charSequence);
        m16150e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (m16149d(obj)) {
            ke9 ke9Var = new ke9(obj);
            this.f49562b.add(ke9Var);
            obj = ke9Var;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new le9(this.f49561a, this, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        replace(i, i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
        replace(i, i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m16146a();
        super.replace(i, i2, charSequence, i3, i4);
        m16150e();
        return this;
    }

    public le9(Class cls, le9 le9Var, int i, int i2) {
        super(le9Var, i, i2);
        this.f49562b = new ArrayList();
        xwc.m24776n(cls, "watcherClass cannot be null");
        this.f49561a = cls;
    }
}
