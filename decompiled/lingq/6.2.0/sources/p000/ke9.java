package p000;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class ke9 implements TextWatcher, SpanWatcher {

    /* JADX INFO: renamed from: a */
    public final Object f47111a;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f47112b = new AtomicInteger(0);

    public ke9(Object obj) {
        this.f47111a = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f47111a).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.f47111a).beforeTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        if (this.f47112b.get() <= 0 || !(obj instanceof sda)) {
            ((SpanWatcher) this.f47111a).onSpanAdded(spannable, obj, i, i2);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        if (this.f47112b.get() <= 0 || !(obj instanceof sda)) {
            ((SpanWatcher) this.f47111a).onSpanChanged(spannable, obj, i, i2, i3, i4);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
        if (this.f47112b.get() <= 0 || !(obj instanceof sda)) {
            ((SpanWatcher) this.f47111a).onSpanRemoved(spannable, obj, i, i2);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.f47111a).onTextChanged(charSequence, i, i2, i3);
    }
}
