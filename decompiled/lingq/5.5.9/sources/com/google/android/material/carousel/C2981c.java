package com.google.android.material.carousel;

import android.support.v4.media.AbstractC0140a;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.linguist.R;
import p321pc.InterfaceC8217a;

/* JADX INFO: renamed from: com.google.android.material.carousel.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2981c extends AbstractC0140a {
    /* JADX WARN: Code duplicated, block: B:23:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ed A[LOOP:0: B:35:0x00eb->B:36:0x00ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x010c A[LOOP:1: B:43:0x010a->B:44:0x010c, LOOP_END] */
    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: W */
    public final C2979a mo585W(InterfaceC8217a interfaceC8217a, View view) {
        int iRound;
        char c10;
        int i10;
        float f3;
        float fMax;
        float f10;
        float f11;
        float f12;
        C2979a.a aVar;
        int i11;
        int i12;
        RecyclerView.C1121n c1121n = (RecyclerView.C1121n) view.getLayoutParams();
        float f13 = ((ViewGroup.MarginLayoutParams) c1121n).leftMargin + ((ViewGroup.MarginLayoutParams) c1121n).rightMargin;
        float dimension = view.getContext().getResources().getDimension(R.dimen.m3_carousel_small_item_size) + f13;
        float dimension2 = view.getContext().getResources().getDimension(R.dimen.m3_carousel_gone_size) + f13;
        CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) interfaceC8217a;
        float f14 = carouselLayoutManager.f7097n;
        float f15 = f14 - dimension;
        float measuredWidth = view.getMeasuredWidth() + f13;
        float f16 = 0.0f;
        if (f15 > dimension) {
            if (measuredWidth >= f15) {
                f14 = f15;
                c10 = 0;
                i10 = 1;
            } else {
                float f17 = f14 - ((measuredWidth - (0.25f * measuredWidth)) + dimension);
                float f18 = f14 - (((dimension * 0.25f) + dimension) + dimension);
                iRound = Math.round(((f17 + f18) / 2.0f) / measuredWidth);
                float f19 = iRound;
                float f20 = measuredWidth * f19;
                float f21 = f20 < f17 ? f17 / f19 : f20 > f18 ? f18 / f19 : measuredWidth;
                int iRound2 = Math.round(f15 / measuredWidth);
                float f22 = f15 / iRound2;
                if (Math.abs(measuredWidth - f21) <= Math.abs(measuredWidth - f22)) {
                    f16 = (f14 - (f19 * f21)) - dimension;
                    f14 = f21;
                    c10 = 1;
                } else {
                    f14 = f22;
                    f16 = 0.0f;
                    c10 = 0;
                    iRound = iRound2;
                }
                i10 = 1;
            }
            float f23 = dimension2 / 2.0f;
            float f24 = 0.0f - f23;
            float f25 = f14 / 2.0f;
            f3 = f25 + 0.0f;
            fMax = (Math.max(0, iRound - 1) * f14) + f3;
            f10 = f25 + fMax;
            if (c10 > 0) {
                fMax = (f16 / 2.0f) + f10;
            }
            if (c10 > 0) {
                f10 = (f16 / 2.0f) + fMax;
            }
            if (i10 > 0) {
                f11 = (dimension / 2.0f) + f10;
            } else {
                f11 = fMax;
            }
            float f26 = carouselLayoutManager.f7097n + f23;
            float f27 = f14 - f13;
            float f28 = 1.0f - ((dimension2 - f13) / f27);
            f12 = 1.0f - ((dimension - f13) / f27);
            float f29 = 1.0f - ((f16 - f13) / f27);
            aVar = new C2979a.a(f14);
            aVar.m8662a(f24, f28, dimension2, false);
            if (iRound > 0 && f14 > 0.0f) {
                i12 = 0;
                while (i12 < iRound) {
                    aVar.m8662a((i12 * f14) + f3, 0.0f, f14, true);
                    i12++;
                    iRound = iRound;
                }
            }
            aVar.m8662a(fMax, f29, f16, false);
            if (i10 > 0 && dimension > 0.0f) {
                for (i11 = 0; i11 < i10; i11++) {
                    aVar.m8662a((i11 * dimension) + f11, f12, dimension, false);
                }
            }
            aVar.m8662a(f26, f28, dimension2, false);
            return aVar.m8663b();
        }
        c10 = 0;
        i10 = 0;
        iRound = 1;
        float f210 = dimension2 / 2.0f;
        float f211 = 0.0f - f210;
        float f212 = f14 / 2.0f;
        f3 = f212 + 0.0f;
        fMax = (Math.max(0, iRound - 1) * f14) + f3;
        f10 = f212 + fMax;
        if (c10 > 0) {
            fMax = (f16 / 2.0f) + f10;
        }
        if (c10 > 0) {
            f10 = (f16 / 2.0f) + fMax;
        }
        if (i10 > 0) {
            f11 = (dimension / 2.0f) + f10;
        } else {
            f11 = fMax;
        }
        float f213 = carouselLayoutManager.f7097n + f210;
        float f214 = f14 - f13;
        float f215 = 1.0f - ((dimension2 - f13) / f214);
        f12 = 1.0f - ((dimension - f13) / f214);
        float f216 = 1.0f - ((f16 - f13) / f214);
        aVar = new C2979a.a(f14);
        aVar.m8662a(f211, f215, dimension2, false);
        if (iRound > 0) {
            i12 = 0;
            while (i12 < iRound) {
                aVar.m8662a((i12 * f14) + f3, 0.0f, f14, true);
                i12++;
                iRound = iRound;
            }
        }
        aVar.m8662a(fMax, f216, f16, false);
        if (i10 > 0) {
            while (i11 < i10) {
                aVar.m8662a((i11 * dimension) + f11, f12, dimension, false);
            }
        }
        aVar.m8662a(f213, f215, dimension2, false);
        return aVar.m8663b();
    }
}
