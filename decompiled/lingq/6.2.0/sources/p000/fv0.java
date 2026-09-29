package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import com.lingq.core.font.R$font;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fv0 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39725a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f39726b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f39727c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f39728d;

    public /* synthetic */ fv0(long j, e28 e28Var, o6a o6aVar) {
        this.f39726b = j;
        this.f39727c = e28Var;
        this.f39728d = o6aVar;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        float fM14430m;
        int i = this.f39725a;
        xfa xfaVar = xfa.f68157a;
        Object obj2 = this.f39728d;
        Object obj3 = this.f39727c;
        switch (i) {
            case 0:
                Context context = (Context) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                interfaceC0310a.getClass();
                context.getClass();
                int size = arrayList.size();
                if (size > 7) {
                    size = 7;
                }
                Canvas canvasM19936a = AbstractC3497qg.m19936a(interfaceC0310a.mo603o0().m16515r());
                float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32)) / (size - 1);
                for (int i2 = 0; i2 < size; i2++) {
                    TextPaint textPaint = new TextPaint();
                    String str = (String) arrayList.get(i2);
                    str.getClass();
                    int length = str.length();
                    if (length == 1 || length == 2) {
                        fM14430m = jfa.m14430m(context, 10);
                    } else if (length != 3) {
                        textPaint.setTextSize(jfa.m14430m(context, 10));
                        textPaint.getTextBounds(str, 0, str.length(), new Rect());
                        float fM14430m2 = jfa.m14430m(context, 5);
                        fM14430m = ((str.length() / (str.length() + 1.5f)) * fM14430m2) + fM14430m2;
                    } else {
                        fM14430m = jfa.m14430m(context, 9);
                    }
                    textPaint.setTextSize(fM14430m);
                    textPaint.setColor(d32.m10042h0(this.f39726b));
                    textPaint.setTextAlign(Paint.Align.CENTER);
                    textPaint.setTypeface(Typeface.create(f88.m11597a(context, R$font.dm_sans_regular), 0));
                    canvasM19936a.drawText((String) arrayList.get(i2), i2 * fIntBitsToFloat, Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L)) - interfaceC0310a.mo912g0(8.0f), textPaint);
                }
                break;
            default:
                e28 e28Var = (e28) obj3;
                InterfaceC0310a interfaceC0310a2 = (InterfaceC0310a) obj;
                interfaceC0310a2.getClass();
                InterfaceC0310a.m1414L0(interfaceC0310a2, this.f39726b, 0L, 0L, 0.0f, null, 0, 126);
                interfaceC0310a2.mo598h0(aa1.f411j, (240 & 2) != 0 ? 0L : e28Var.m10805f(), e28Var.m10804e(), (((long) Float.floatToRawIntBits(32.0f)) << 32) | (((long) Float.floatToRawIntBits(32.0f)) & 4294967295L), (240 & 16) != 0 ? w33.f66328a : null, (240 & 128) != 0 ? 3 : 0);
                InterfaceC0310a.m1412G(interfaceC0310a2, (i39) obj2, e28Var.m10805f(), e28Var.m10804e(), (((long) Float.floatToRawIntBits(32.0f)) << 32) | (((long) Float.floatToRawIntBits(32.0f)) & 4294967295L), 0.0f, new el9(6.0f, 0.0f, 0, 0, 30), null, 208);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ fv0(Context context, ArrayList arrayList, long j) {
        this.f39727c = context;
        this.f39728d = arrayList;
        this.f39726b = j;
    }
}
