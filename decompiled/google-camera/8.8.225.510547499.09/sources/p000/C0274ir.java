package p000;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.wear.ambient.AmbientDelegate;
import java.io.IOException;
import java.text.AttributedCharacterIterator;
import java.text.Format;
import java.util.Map;

/* JADX INFO: renamed from: ir */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0274ir {

    /* JADX INFO: renamed from: a */
    public int f31845a;

    /* JADX INFO: renamed from: b */
    public final Object f31846b;

    /* JADX INFO: renamed from: c */
    public Object f31847c;

    public C0274ir() {
        this.f31846b = new float[16];
    }

    public C0274ir(ImageView imageView) {
        this.f31845a = 0;
        this.f31846b = imageView;
    }

    public C0274ir(StringBuffer stringBuffer) {
        this.f31846b = stringBuffer;
        this.f31845a = stringBuffer.length();
        this.f31847c = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m11622a() {
        if (((ImageView) this.f31846b).getDrawable() != null) {
            ((ImageView) this.f31846b).getDrawable().setLevel(this.f31845a);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11623b() {
        Object obj;
        Drawable drawable = ((ImageView) this.f31846b).getDrawable();
        if (drawable != null) {
            C0768kh.m14232c(drawable);
        }
        if (drawable == null || (obj = this.f31847c) == null) {
            return;
        }
        C0833ms.m16838h(drawable, (C0850ni) obj, ((ImageView) this.f31846b).getDrawableState());
    }

    /* JADX INFO: renamed from: c */
    public final void m11624c(AttributeSet attributeSet, int i) {
        int iM1616s;
        AmbientDelegate ambientDelegateM1568D = AmbientDelegate.m1568D(((ImageView) this.f31846b).getContext(), attributeSet, C0193fr.f23262f, i, 0);
        Object obj = this.f31846b;
        afn.m536c((View) obj, ((ImageView) obj).getContext(), C0193fr.f23262f, attributeSet, (TypedArray) ambientDelegateM1568D.f1686b, i, 0);
        try {
            Drawable drawable = ((ImageView) this.f31846b).getDrawable();
            if (drawable == null && (iM1616s = ambientDelegateM1568D.m1616s(1, -1)) != -1 && (drawable = C0194fs.m8752a(((ImageView) this.f31846b).getContext(), iM1616s)) != null) {
                ((ImageView) this.f31846b).setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0768kh.m14232c(drawable);
            }
            if (ambientDelegateM1568D.m1575A(2)) {
                ahj.m675c((ImageView) this.f31846b, ambientDelegateM1568D.m1617t(2));
            }
            if (ambientDelegateM1568D.m1575A(3)) {
                ahj.m676d((ImageView) this.f31846b, C0768kh.m14230a(ambientDelegateM1568D.m1613p(3, -1), null));
            }
        } finally {
            ambientDelegateM1568D.m1622y();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m11625d(Drawable drawable) {
        this.f31845a = drawable.getLevel();
    }

    /* JADX INFO: renamed from: e */
    public final void m11626e(int i) {
        if (i != 0) {
            Drawable drawableM8752a = C0194fs.m8752a(((ImageView) this.f31846b).getContext(), i);
            if (drawableM8752a != null) {
                C0768kh.m14232c(drawableM8752a);
            }
            ((ImageView) this.f31846b).setImageDrawable(drawableM8752a);
        } else {
            ((ImageView) this.f31846b).setImageDrawable(null);
        }
        m11623b();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m11627f() {
        return !(((ImageView) this.f31846b).getBackground() instanceof RippleDrawable);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Appendable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: h */
    public final void m11629h(Format format, Object obj) {
        if (this.f31847c == null) {
            m11628g(format.format(obj));
            return;
        }
        AttributedCharacterIterator toCharacterIterator = format.formatToCharacterIterator(obj);
        int i = this.f31845a;
        ?? r0 = this.f31846b;
        try {
            int beginIndex = toCharacterIterator.getBeginIndex();
            int endIndex = toCharacterIterator.getEndIndex();
            int i2 = endIndex - beginIndex;
            if (beginIndex < endIndex) {
                r0.append(toCharacterIterator.first());
                while (true) {
                    beginIndex++;
                    if (beginIndex >= endIndex) {
                        break;
                    } else {
                        r0.append(toCharacterIterator.next());
                    }
                }
            }
            this.f31845a = i2 + i;
            toCharacterIterator.first();
            int index = toCharacterIterator.getIndex();
            int endIndex2 = toCharacterIterator.getEndIndex();
            int i3 = i - index;
            while (index < endIndex2) {
                Map<AttributedCharacterIterator.Attribute, Object> attributes = toCharacterIterator.getAttributes();
                int runLimit = toCharacterIterator.getRunLimit();
                if (attributes.size() != 0) {
                    for (Map.Entry<AttributedCharacterIterator.Attribute, Object> entry : attributes.entrySet()) {
                        this.f31847c.add(new C1181zp(entry.getKey(), entry.getValue(), i3 + index, i3 + runLimit));
                    }
                }
                toCharacterIterator.setIndex(runLimit);
                index = runLimit;
            }
        } catch (IOException e) {
            throw new C0003ac(e);
        }
    }

    public C0274ir(StringBuilder sb) {
        this.f31846b = sb;
        this.f31845a = sb.length();
        this.f31847c = null;
    }

    /* JADX INFO: renamed from: i */
    public final void m11630i(Format format, Object obj, String str) {
        if (this.f31847c != null || str == null) {
            m11629h(format, obj);
        } else {
            m11628g(str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Appendable, java.lang.Object] */
    /* JADX INFO: renamed from: g */
    public final void m11628g(CharSequence charSequence) {
        try {
            this.f31846b.append(charSequence);
            this.f31845a += charSequence.length();
        } catch (IOException e) {
            throw new C0003ac(e);
        }
    }
}
