package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: androidx.emoji2.text.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0902p extends SpannableStringBuilder {

    /* JADX INFO: renamed from: a */
    public final Class<?> f6042a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f6043b;

    /* JADX INFO: renamed from: androidx.emoji2.text.p$a */
    public static class a implements TextWatcher, SpanWatcher {

        /* JADX INFO: renamed from: a */
        public final Object f6044a;

        /* JADX INFO: renamed from: b */
        public final AtomicInteger f6045b = new AtomicInteger(0);

        public a(Object obj) {
            this.f6044a = obj;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f6044a).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            ((TextWatcher) this.f6044a).beforeTextChanged(charSequence, i10, i11, i12);
        }

        @Override // android.text.SpanWatcher
        public final void onSpanAdded(Spannable spannable, Object obj, int i10, int i11) {
            if (this.f6045b.get() <= 0 || !(obj instanceof AbstractC0898l)) {
                ((SpanWatcher) this.f6044a).onSpanAdded(spannable, obj, i10, i11);
            }
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0021 A[PHI: r12
          0x0021: PHI (r12v1 int) = (r12v0 int), (r12v3 int) binds: [B:9:0x0015, B:13:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.text.SpanWatcher
        public final void onSpanChanged(Spannable spannable, Object obj, int i10, int i11, int i12, int i13) {
            int i14;
            int i15;
            if (this.f6045b.get() <= 0 || !(obj instanceof AbstractC0898l)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    i14 = i10;
                    i15 = i12;
                } else {
                    if (i10 > i11) {
                        i10 = 0;
                    }
                    if (i12 > i13) {
                        i14 = i10;
                        i15 = 0;
                    } else {
                        i14 = i10;
                        i15 = i12;
                    }
                }
                ((SpanWatcher) this.f6044a).onSpanChanged(spannable, obj, i14, i11, i15, i13);
            }
        }

        @Override // android.text.SpanWatcher
        public final void onSpanRemoved(Spannable spannable, Object obj, int i10, int i11) {
            if (this.f6045b.get() <= 0 || !(obj instanceof AbstractC0898l)) {
                ((SpanWatcher) this.f6044a).onSpanRemoved(spannable, obj, i10, i11);
            }
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            ((TextWatcher) this.f6044a).onTextChanged(charSequence, i10, i11, i12);
        }
    }

    public C0902p(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        this.f6043b = new ArrayList();
        if (cls == null) {
            throw new NullPointerException("watcherClass cannot be null");
        }
        this.f6042a = cls;
    }

    public C0902p(Class<?> cls, CharSequence charSequence, int i10, int i11) {
        super(charSequence, i10, i11);
        this.f6043b = new ArrayList();
        if (cls == null) {
            throw new NullPointerException("watcherClass cannot be null");
        }
        this.f6042a = cls;
    }

    /* JADX INFO: renamed from: a */
    public final void m3545a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f6043b;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i10)).f6045b.incrementAndGet();
            i10++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i10) {
        super.append(charSequence, obj, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c10) throws IOException {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) throws IOException {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11) throws IOException {
        super.append(charSequence, i10, i11);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m3546b() {
        m3549e();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f6043b;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i10)).onTextChanged(this, 0, length(), length());
            i10++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final a m3547c(Object obj) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f6043b;
            if (i10 >= arrayList.size()) {
                return null;
            }
            a aVar = (a) arrayList.get(i10);
            if (aVar.f6044a == obj) {
                return aVar;
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3548d(Object obj) {
        if (obj != null) {
            return this.f6042a == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final Editable delete(int i10, int i11) {
        super.delete(i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder delete(int i10, int i11) {
        super.delete(i10, i11);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final void m3549e() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f6043b;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i10)).f6045b.decrementAndGet();
            i10++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        a aVarM3547c;
        if (m3548d(obj) && (aVarM3547c = m3547c(obj)) != null) {
            obj = aVarM3547c;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        a aVarM3547c;
        if (m3548d(obj) && (aVarM3547c = m3547c(obj)) != null) {
            obj = aVarM3547c;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        a aVarM3547c;
        if (m3548d(obj) && (aVarM3547c = m3547c(obj)) != null) {
            obj = aVarM3547c;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @SuppressLint({"UnknownNullness"})
    public final <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        if (!(this.f6042a == cls)) {
            return (T[]) super.getSpans(i10, i11, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i10, i11, a.class);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, aVarArr.length));
        for (int i12 = 0; i12 < aVarArr.length; i12++) {
            tArr[i12] = aVarArr[i12].f6044a;
        }
        return tArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final Editable insert(int i10, CharSequence charSequence) {
        super.insert(i10, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final Editable insert(int i10, CharSequence charSequence, int i11, int i12) {
        super.insert(i10, charSequence, i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder insert(int i10, CharSequence charSequence) {
        super.insert(i10, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder insert(int i10, CharSequence charSequence, int i11, int i12) {
        super.insert(i10, charSequence, i11, i12);
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000f  */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i10, int i11, Class cls) {
        if (cls == null) {
            cls = a.class;
        } else {
            if (this.f6042a == cls) {
                cls = a.class;
            }
        }
        return super.nextSpanTransition(i10, i11, cls);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0018  */
    /* JADX WARN: Code duplicated, block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        a aVarM3547c;
        if (m3548d(obj)) {
            aVarM3547c = m3547c(obj);
            if (aVarM3547c != null) {
                obj = aVarM3547c;
            }
            super.removeSpan(obj);
            if (aVarM3547c != null) {
                this.f6043b.remove(aVarM3547c);
            }
        }
        aVarM3547c = null;
        super.removeSpan(obj);
        if (aVarM3547c != null) {
            this.f6043b.remove(aVarM3547c);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final /* bridge */ /* synthetic */ Editable replace(int i10, int i11, CharSequence charSequence) {
        replace(i10, i11, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final /* bridge */ /* synthetic */ Editable replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        replace(i10, i11, charSequence, i12, i13);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence) {
        m3545a();
        super.replace(i10, i11, charSequence);
        m3549e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        m3545a();
        super.replace(i10, i11, charSequence, i12, i13);
        m3549e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        if (m3548d(obj)) {
            a aVar = new a(obj);
            this.f6043b.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i10, i11, i12);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @SuppressLint({"UnknownNullness"})
    public final CharSequence subSequence(int i10, int i11) {
        return new C0902p(this.f6042a, this, i10, i11);
    }
}
