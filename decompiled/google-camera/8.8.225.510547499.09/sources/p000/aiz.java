package p000;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aiz implements TextWatcher, SpanWatcher {

    /* JADX INFO: renamed from: a */
    final Object f476a;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f477b = new AtomicInteger(0);

    public aiz(Object obj) {
        this.f476a = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f476a).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.f476a).beforeTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        if (this.f477b.get() <= 0 || !(obj instanceof aiy)) {
            ((SpanWatcher) this.f476a).onSpanAdded(spannable, obj, i, i2);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        if (this.f477b.get() <= 0 || !(obj instanceof aiy)) {
            ((SpanWatcher) this.f476a).onSpanChanged(spannable, obj, i, i2, i3, i4);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
        if (this.f477b.get() <= 0 || !(obj instanceof aiy)) {
            ((SpanWatcher) this.f476a).onSpanRemoved(spannable, obj, i, i2);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.f476a).onTextChanged(charSequence, i, i2, i3);
    }
}
