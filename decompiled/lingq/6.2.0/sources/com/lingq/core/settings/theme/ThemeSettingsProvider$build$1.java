package com.lingq.core.settings.theme;

import com.lingq.core.domain.model.LanguageLearn;
import com.lingq.core.domain.model.reader.ReaderPageMode;
import com.lingq.core.domain.model.settings.JapaneseScript;
import com.lingq.core.domain.model.theme.ReaderFont;
import com.lingq.core.domain.model.theme.TextHighlightStyle;
import com.lingq.core.domain.store.AudioUnderlineMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3184kh;
import p000.AbstractC3423or;
import p000.c32;
import p000.dj3;
import p000.gm5;
import p000.jz9;
import p000.kz9;
import p000.lz9;
import p000.mz9;
import p000.nz9;
import p000.rj2;
import p000.sj2;
import p000.tj2;
import p000.uj2;
import p000.v91;
import p000.vj2;
import p000.vs3;
import p000.xfa;
import p000.xv7;
import p000.ys2;
import p000.yz7;
import p000.zz7;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.theme.ThemeSettingsProvider$build$1", m4291f = "ThemeSettingsState.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ThemeSettingsProvider$build$1 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ jz9 f23198a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ kz9 f23199b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f23200c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ mz9 f23201d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ lz9 f23202e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1882b f23203f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f23204g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeSettingsProvider$build$1(C1882b c1882b, String str, Continuation continuation) {
        super(6, continuation);
        this.f23203f = c1882b;
        this.f23204g = str;
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        ThemeSettingsProvider$build$1 themeSettingsProvider$build$1 = new ThemeSettingsProvider$build$1(this.f23203f, this.f23204g, (Continuation) obj6);
        themeSettingsProvider$build$1.f23198a = (jz9) obj;
        themeSettingsProvider$build$1.f23199b = (kz9) obj2;
        themeSettingsProvider$build$1.f23200c = zBooleanValue;
        themeSettingsProvider$build$1.f23201d = (mz9) obj4;
        themeSettingsProvider$build$1.f23202e = (lz9) obj5;
        return themeSettingsProvider$build$1.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Pair pair;
        boolean z;
        int i;
        ?? M8682b;
        jz9 jz9Var = this.f23198a;
        kz9 kz9Var = this.f23199b;
        boolean z2 = this.f23200c;
        mz9 mz9Var = this.f23201d;
        lz9 lz9Var = this.f23202e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        Map map = jz9Var.f46435a;
        int i2 = jz9Var.f46436b;
        double d = jz9Var.f46437c;
        TextHighlightStyle textHighlightStyle = jz9Var.f46438d;
        String str = jz9Var.f46439e;
        vs3 vs3Var = kz9Var.f48821a;
        vj2 vj2Var = kz9Var.f48822b;
        boolean z3 = kz9Var.f48823c;
        boolean z4 = kz9Var.f48824d;
        ReaderPageMode readerPageMode = kz9Var.f48825e;
        Pair pair2 = null;
        if (!(vj2Var instanceof tj2)) {
            if (vj2Var instanceof rj2) {
                pair2 = new Pair(((rj2) vj2Var).f59401a, new Integer(100));
            } else {
                if (vj2Var instanceof uj2) {
                    uj2 uj2Var = (uj2) vj2Var;
                    pair = new Pair(uj2Var.f63987a, new Integer(uj2Var.f63988b));
                } else {
                    if (!(vj2Var instanceof sj2)) {
                        gm5.m12750e();
                        return null;
                    }
                    pair = new Pair(((sj2) vj2Var).f60923a, new Integer(-1));
                }
                pair2 = pair;
            }
        }
        int i3 = i2;
        double dMax = Math.max(z3 ? 1.15d : 0.0d, z2 != 0 ? 1.15d : 0.0d);
        String str2 = this.f23204g;
        List listM8682b = C1882b.m8682b(str2);
        ReaderFont readerFontM24710a = (ReaderFont) map.get(str2);
        if (readerFontM24710a == null) {
            ReaderFont.Companion.getClass();
            readerFontM24710a = xv7.m24710a(str2);
        }
        ReaderFont readerFont = readerFontM24710a;
        ReaderFont.Companion.getClass();
        ArrayList arrayListM24712c = xv7.m24712c(str2);
        if (d >= dMax) {
            dMax = d;
        }
        zz7 zz7Var = zz7.f72426a;
        yz7 yz7VarM25898a = zz7.m25898a(str);
        if (yz7VarM25898a == null) {
            yz7VarM25898a = zz7.f72427b;
        }
        yz7 yz7Var = yz7VarM25898a;
        boolean z5 = false;
        if (z3 && d < 1.15d) {
            z5 = true;
        }
        boolean z6 = z5;
        boolean z7 = mz9Var.f52087a;
        boolean z8 = mz9Var.f52088b;
        boolean z9 = mz9Var.f52089c;
        double d2 = dMax;
        AudioUnderlineMode audioUnderlineMode = lz9Var.f50356a;
        boolean z10 = lz9Var.f50357b;
        boolean z11 = lz9Var.f50358c;
        boolean zM15231z = AbstractC3184kh.m15231z(str2);
        boolean zM15229x = AbstractC3184kh.m15229x(str2);
        String str3 = lz9Var.f50359d;
        if (str2.equals(LanguageLearn.Japanese.getCode())) {
            ys2 entries = JapaneseScript.getEntries();
            ArrayList arrayList = new ArrayList();
            Iterator it = entries.iterator();
            while (it.hasNext()) {
                Iterator it2 = it;
                Object next = it2.next();
                boolean z12 = z10;
                int i4 = i3;
                if (((JapaneseScript) next) != JapaneseScript.Furigana) {
                    arrayList.add(next);
                }
                it = it2;
                i3 = i4;
                z10 = z12;
            }
            z = z10;
            i = i3;
            M8682b = new ArrayList(v91.m23189q0(arrayList, 10));
            for (Iterator it3 = arrayList.iterator(); it3.hasNext(); it3 = it3) {
                JapaneseScript japaneseScript = (JapaneseScript) it3.next();
                M8682b.add(new Pair(Integer.valueOf(AbstractC3423or.m18257h0(japaneseScript)), japaneseScript.name()));
            }
        } else {
            z = z10;
            i = i3;
            M8682b = C1882b.m8682b(str2);
        }
        return new nz9(i, d2, arrayListM24712c, readerFont, pair2, yz7Var, vs3Var, textHighlightStyle, z6, z4, readerPageMode, z2, z7, z8, z9, audioUnderlineMode, z, z11, zM15231z, zM15229x, listM8682b, str3, (List) M8682b, lz9Var.f50360e, 4096);
    }
}
