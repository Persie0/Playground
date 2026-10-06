package p000;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aja extends SpannableStringBuilder {

    /* JADX INFO: renamed from: a */
    private final Class f479a;

    /* JADX INFO: renamed from: b */
    private final List f480b;

    public aja(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f480b = new ArrayList();
        this.f479a = cls;
    }

    /* JADX INFO: renamed from: a */
    private final aiz m796a(Object obj) {
        for (int i = 0; i < this.f480b.size(); i++) {
            aiz aizVar = (aiz) this.f480b.get(i);
            if (aizVar.f476a == obj) {
                return aizVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private final void m797b() {
        for (int i = 0; i < this.f480b.size(); i++) {
            ((aiz) this.f480b.get(i)).f477b.incrementAndGet();
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m798c() {
        for (int i = 0; i < this.f480b.size(); i++) {
            ((aiz) this.f480b.get(i)).f477b.decrementAndGet();
        }
    }

    /* JADX INFO: renamed from: d */
    private final boolean m799d(Class cls) {
        return this.f479a == cls;
    }

    /* JADX INFO: renamed from: e */
    private final boolean m800e(Object obj) {
        return obj != null && m799d(obj.getClass());
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* synthetic */ Editable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* synthetic */ Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        aiz aizVarM796a;
        if (m800e(obj) && (aizVarM796a = m796a(obj)) != null) {
            obj = aizVarM796a;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        aiz aizVarM796a;
        if (m800e(obj) && (aizVarM796a = m796a(obj)) != null) {
            obj = aizVarM796a;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        aiz aizVarM796a;
        if (m800e(obj) && (aizVarM796a = m796a(obj)) != null) {
            obj = aizVarM796a;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        if (!m799d(cls)) {
            return super.getSpans(i, i2, cls);
        }
        aiz[] aizVarArr = (aiz[]) super.getSpans(i, i2, aiz.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, aizVarArr.length);
        for (int i3 = 0; i3 < aizVarArr.length; i3++) {
            objArr[i3] = aizVarArr[i3].f476a;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* synthetic */ Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        if (cls == null || m799d(cls)) {
            cls = aiz.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        aiz aizVarM796a;
        if (m800e(obj)) {
            aizVarM796a = m796a(obj);
            if (aizVarM796a != null) {
                obj = aizVarM796a;
            }
        } else {
            aizVarM796a = null;
        }
        super.removeSpan(obj);
        if (aizVarM796a != null) {
            this.f480b.remove(aizVarM796a);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
        replace(i, i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (m800e(obj)) {
            aiz aizVar = new aiz(obj);
            this.f480b.add(aizVar);
            obj = aizVar;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new aja(this.f479a, this, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c) {
        super.append(c);
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

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        m797b();
        super.replace(i, i2, charSequence);
        m798c();
        return this;
    }

    public aja(Class cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        this.f480b = new ArrayList();
        abf.m91d(cls, "watcherClass cannot be null");
        this.f479a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* synthetic */ Appendable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* synthetic */ Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* synthetic */ Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        replace(i, i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* synthetic */ Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m797b();
        super.replace(i, i2, charSequence, i3, i4);
        m798c();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* synthetic */ Editable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
