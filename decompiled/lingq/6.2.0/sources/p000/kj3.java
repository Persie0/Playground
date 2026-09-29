package p000;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.appcompat.widget.C0035b;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.C0778d;
import androidx.work.impl.constraints.AbstractC0776b;
import com.google.android.gms.internal.measurement.C0962f;
import com.google.android.gms.internal.measurement.zzaeh;
import com.google.android.gms.internal.play_billing.AbstractC0985a;
import com.google.android.gms.internal.play_billing.zzbw;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.C1043b;
import com.google.android.gms.measurement.internal.C1045d;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.measurement.internal.zzr;
import com.google.android.material.R$attr;
import com.google.common.collect.C1097m;
import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.AbstractC1112b;
import com.google.common.util.concurrent.AbstractC1118h;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.mlkit.common.MlKitException;
import com.lingq.core.designsystem.R$color;
import com.lingq.core.designsystem.R$dimen;
import com.lingq.core.domain.model.theme.TextHighlightStyle;
import com.lingq.core.token.TokenPopupData;
import com.lingq.feature.dictionary.C2064h;
import com.lingq.feature.reader.old.ReaderFragment;
import com.lingq.feature.reader.old.ReaderPageFragment;
import com.lingq.feature.reader.pagination.p015ui.LessonTextView;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.AbstractC3193b;
import kotlin.KotlinNullPointerException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes2.dex */
public final class kj3 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47374a;

    /* JADX INFO: renamed from: b */
    public Object f47375b;

    /* JADX INFO: renamed from: c */
    public Object f47376c;

    public kj3(za4 za4Var, va4 va4Var, int i) {
        this.f47374a = 4;
        this.f47376c = za4Var;
        this.f47375b = va4Var;
    }

    /* JADX INFO: renamed from: a */
    private final void m15268a() {
        Context context = ((C0962f) this.f47375b).f11845b;
        Map map = C3366nb.f52555i;
        if (map == null) {
            synchronized (C3366nb.f52554h) {
                map = C3366nb.f52555i;
                if (map == null) {
                    C1097m c1097mM6295a = ImmutableMap.m6295a();
                    try {
                        String[] list = context.getAssets().list("phenotype");
                        if (list != null) {
                            for (String str : list) {
                                if (str.endsWith("_package_metadata.binarypb")) {
                                    try {
                                        AssetManager assets = context.getAssets();
                                        StringBuilder sb = new StringBuilder(str.length() + 10);
                                        sb.append("phenotype/");
                                        sb.append(str);
                                        InputStream inputStreamOpen = assets.open(sb.toString());
                                        try {
                                            phb phbVar = phb.f56224a;
                                            int i = dhb.f35664a;
                                            C3366nb c3366nb = new C3366nb(context, wad.m23826v(inputStreamOpen, phb.f56225b));
                                            c1097mM6295a.m6340b(c3366nb.f52557b, c3366nb);
                                            if (inputStreamOpen != null) {
                                                inputStreamOpen.close();
                                            }
                                        } catch (Throwable th) {
                                            if (inputStreamOpen != null) {
                                                try {
                                                    inputStreamOpen.close();
                                                } catch (Throwable th2) {
                                                    th.addSuppressed(th2);
                                                }
                                            }
                                            throw th;
                                        }
                                    } catch (zzaeh e) {
                                        StringBuilder sb2 = new StringBuilder(str.length() + 45);
                                        sb2.append("Unable to read Phenotype PackageMetadata for ");
                                        sb2.append(str);
                                        Log.e("PackageInfo", sb2.toString(), e);
                                    }
                                }
                            }
                        }
                    } catch (IOException e2) {
                        Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata from assets.", e2);
                    }
                    ImmutableMap immutableMapM6339a = c1097mM6295a.m6339a(true);
                    C3366nb.f52555i = immutableMapM6339a;
                    map = immutableMapM6339a;
                }
            }
        }
        String str2 = (String) this.f47376c;
        if (((ImmutableMap) map).containsKey(str2)) {
            return;
        }
        StringBuilder sb3 = new StringBuilder(str2.length() + 173);
        sb3.append("Config package ");
        sb3.append(str2);
        sb3.append(" cannot use FILE backing without declarative registration. See go/phenotype-android-integration#phenotype for more information. This will lead to stale flags.");
        Log.e("FilePhenotypeFlags", sb3.toString());
    }

    /* JADX WARN: Code duplicated, block: B:118:0x023d A[Catch: all -> 0x023b, TryCatch #8 {all -> 0x023b, blocks: (B:104:0x021d, B:106:0x0221, B:108:0x0225, B:113:0x0232, B:118:0x023d, B:119:0x0248), top: B:382:0x021d }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r28v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r28v4, types: [java.lang.Throwable] */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thM6388p;
        fw5 fw5Var;
        int length;
        int length2;
        boolean z;
        boolean z2;
        boolean z3 = true;
        int i = 0;
        p8b p8bVar = null;
        switch (this.f47374a) {
            case 0:
                cdb cdbVar = (cdb) this.f47376c;
                ListenableFuture listenableFuture = (ListenableFuture) this.f47375b;
                if ((listenableFuture instanceof AbstractC1112b) && (thM6388p = ((AbstractC1112b) listenableFuture).m6388p()) != null) {
                    cdbVar.m4559g(thM6388p);
                    return;
                }
                try {
                    AbstractC1118h.m6398b(listenableFuture);
                    C1043b c1043b = (C1043b) cdbVar.f9946c;
                    c1043b.mo12359D();
                    kjc kjcVar = (kjc) c1043b.f60774a;
                    qfc qfcVar = kjcVar.f47437e;
                    kjc.m15278j(qfcVar);
                    SparseArray sparseArrayM19932J = qfcVar.m19932J();
                    zzoh zzohVar = (zzoh) cdbVar.f9945b;
                    sparseArrayM19932J.put(zzohVar.f12396c, Long.valueOf(zzohVar.f12395b));
                    qfc qfcVar2 = kjcVar.f47437e;
                    kjc.m15278j(qfcVar2);
                    int[] iArr = new int[sparseArrayM19932J.size()];
                    long[] jArr = new long[sparseArrayM19932J.size()];
                    for (int i2 = 0; i2 < sparseArrayM19932J.size(); i2++) {
                        iArr[i2] = sparseArrayM19932J.keyAt(i2);
                        jArr[i2] = ((Long) sparseArrayM19932J.valueAt(i2)).longValue();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putIntArray("uriSources", iArr);
                    bundle.putLongArray("uriTimestamps", jArr);
                    qfcVar2.f57713I.m17689Q(bundle);
                    c1043b.f12331i = false;
                    c1043b.f12332j = 1;
                    xcc xccVar = kjcVar.f47438f;
                    kjc.m15280l(xccVar);
                    xccVar.f68075H.m17924b(zzohVar.f12394a, "Successfully registered trigger URI");
                    c1043b.m5872c0();
                    return;
                } catch (ExecutionException e) {
                    cdbVar.m4559g(e.getCause());
                    return;
                } catch (Throwable th) {
                    cdbVar.m4559g(th);
                    return;
                }
            case 1:
                C3636u5 c3636u5 = (C3636u5) this.f47375b;
                C0035b c0035b = (C0035b) this.f47376c;
                hw5 hw5Var = c0035b.f1216c;
                if (hw5Var != null && (fw5Var = hw5Var.f43041e) != null) {
                    fw5Var.mo12238s(hw5Var);
                }
                View view = (View) c0035b.f1221h;
                if (view != null && view.getWindowToken() != null) {
                    if (c3636u5.m24178c()) {
                        c0035b.f1208O = c3636u5;
                    } else if (c3636u5.f67417f != null) {
                        c3636u5.m24181g(0, 0, false, false);
                        c0035b.f1208O = c3636u5;
                    }
                }
                c0035b.f1210Q = null;
                return;
            case 2:
                hi8 hi8Var = (hi8) this.f47375b;
                Typeface typeface = (Typeface) this.f47376c;
                AbstractC3584sr abstractC3584sr = (AbstractC3584sr) hi8Var.f42410b;
                if (abstractC3584sr != null) {
                    abstractC3584sr.mo21649R(typeface);
                    return;
                }
                return;
            case 3:
                a72 a72Var = (a72) this.f47376c;
                ArrayList<y62> arrayList = (ArrayList) this.f47375b;
                for (y62 y62Var : arrayList) {
                    ArrayList arrayList2 = a72Var.f317r;
                    o38 o38Var = y62Var.f69356a;
                    View view2 = o38Var == null ? null : o38Var.f53781a;
                    o38 o38Var2 = y62Var.f69357b;
                    View view3 = o38Var2 != null ? o38Var2.f53781a : null;
                    if (view2 != null) {
                        ViewPropertyAnimator duration = view2.animate().setDuration(a72Var.f64747f);
                        arrayList2.add(y62Var.f69356a);
                        duration.translationX(y62Var.f69360e - y62Var.f69358c);
                        duration.translationY(y62Var.f69361f - y62Var.f69359d);
                        duration.alpha(0.0f).setListener(new x62(a72Var, y62Var, duration, view2, 0)).start();
                    }
                    if (view3 != null) {
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view3.animate();
                        arrayList2.add(y62Var.f69357b);
                        viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(a72Var.f64747f).alpha(1.0f).setListener(new x62(a72Var, y62Var, viewPropertyAnimatorAnimate, view3, 1)).start();
                    }
                }
                arrayList.clear();
                a72Var.f313n.remove(arrayList);
                return;
            case 4:
                va4 va4Var = (va4) this.f47375b;
                o38 o38Var3 = va4Var.f65126e;
                za4 za4Var = (za4) this.f47376c;
                RecyclerView recyclerView = za4Var.f71277q;
                if (recyclerView == null || !recyclerView.f6623N || va4Var.f65132k || o38Var3.m17782b() == -1) {
                    return;
                }
                v28 itemAnimator = za4Var.f71277q.getItemAnimator();
                if (itemAnimator == null || !itemAnimator.mo153f()) {
                    ArrayList arrayList3 = za4Var.f71276p;
                    int size = arrayList3.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        if (((va4) arrayList3.get(i3)).f65133l) {
                        }
                    }
                    gld gldVar = za4Var.f71273m;
                    gldVar.getClass();
                    o38Var3.getClass();
                    C2064h c2064h = (C2064h) gldVar.f40985b;
                    o38Var3.m17783c();
                    c2064h.getClass();
                    return;
                }
                za4Var.f71277q.post(this);
                return;
            case 5:
                AbstractC3584sr.m21600K((Continuation) this.f47375b).resumeWith(AbstractC3193b.m15358a((Throwable) this.f47376c));
                return;
            case 6:
                ReaderFragment.m9285R0((ReaderFragment) this.f47375b, (TokenPopupData) this.f47376c);
                return;
            case 7:
                String str = "tvContent";
                ReaderPageFragment readerPageFragment = (ReaderPageFragment) this.f47375b;
                vx7 vx7Var = ReaderPageFragment.Companion;
                String str2 = (String) ((C3244l) readerPageFragment.m9299X0().f29258z.f9311a).getValue();
                if (str2.length() > 0) {
                    gy7 gy7Var = (gy7) this.f47376c;
                    LessonTextView lessonTextView = readerPageFragment.f28444F0;
                    if (lessonTextView == null) {
                        fa4.m11636J("tvContent");
                        throw null;
                    }
                    CharSequence text = lessonTextView.getText();
                    text.getClass();
                    SpannableString spannableString = (SpannableString) text;
                    k3a[] k3aVarArr = (k3a[]) spannableString.getSpans(0, spannableString.length(), k3a.class);
                    k3aVarArr.getClass();
                    for (k3a k3aVar : k3aVarArr) {
                        spannableString.removeSpan(k3aVar);
                    }
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannableString.getSpans(0, spannableString.length(), ClickableSpan.class);
                    clickableSpanArr.getClass();
                    for (ClickableSpan clickableSpan : clickableSpanArr) {
                        spannableString.removeSpan(clickableSpan);
                    }
                    ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableString.getSpans(0, spannableString.length(), ForegroundColorSpan.class);
                    foregroundColorSpanArr.getClass();
                    for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
                        spannableString.removeSpan(foregroundColorSpan);
                    }
                    String strMo4589b2 = readerPageFragment.m9299X0().f29223b.mo4589b2();
                    int color = readerPageFragment.m2090R().getColor(R$color.transparent);
                    int iM14431n = jfa.m14431n(readerPageFragment.m2090R(), R$attr.colorOnSurface);
                    int iM14431n2 = jfa.m14431n(readerPageFragment.m2090R(), R$attr.colorOnSecondaryContainer);
                    jfa.m14431n(readerPageFragment.m2090R(), R$attr.colorOnTertiary);
                    jfa.m14431n(readerPageFragment.m2090R(), R$attr.colorSurface);
                    int color2 = readerPageFragment.m2090R().getColor(R$color.transparent);
                    ArrayList arrayList4 = gy7Var.f41527b;
                    TextHighlightStyle textHighlightStyle = gy7Var.f41530e;
                    ArrayList<je9> arrayList5 = new ArrayList();
                    for (Object obj : arrayList4) {
                        if (((je9) obj).f45485f) {
                            arrayList5.add(obj);
                        }
                    }
                    for (je9 je9Var : arrayList5) {
                        xz7 xz7Var = je9Var.f45484e;
                        int length3 = xz7Var.f69005b >= spannableString.length() ? spannableString.length() : xz7Var.f69005b;
                        int i4 = xz7Var.f69004a;
                        if (i4 > length3) {
                            i4 = length3;
                        }
                        TextHighlightStyle textHighlightStyle2 = textHighlightStyle;
                        int i5 = i4;
                        Context contextM2090R = readerPageFragment.m2090R();
                        boolean z4 = z3;
                        LessonTextView lessonTextView2 = readerPageFragment.f28444F0;
                        if (lessonTextView2 == null) {
                            ?? r28 = p8bVar;
                            fa4.m11636J(str);
                            throw r28;
                        }
                        Layout layout = lessonTextView2.getLayout();
                        xz7 xz7Var2 = gy7Var.f41529d;
                        p8b p8bVar2 = p8bVar;
                        spannableString.setSpan(new k3a(contextM2090R, layout, strMo4589b2, je9Var, xz7Var2, textHighlightStyle2, xz7Var2 != null ? z4 : i, color, iM14431n, iM14431n2, je9Var.f45481b, je9Var.f45480a, je9Var.f45482c, color2, readerPageFragment.m2090R().getResources().getDimensionPixelSize(R$dimen.activity_horizontal_margin), gy7Var.f41531f), i5, length3, 33);
                        textHighlightStyle = textHighlightStyle2;
                        z3 = z4;
                        p8bVar = p8bVar2;
                        str = str;
                        i = 0;
                    }
                    String str3 = str;
                    ?? r29 = p8bVar;
                    TextHighlightStyle textHighlightStyle3 = textHighlightStyle;
                    ArrayList arrayList6 = gy7Var.f41527b;
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj2 : arrayList6) {
                        if (!((je9) obj2).f45485f) {
                            arrayList7.add(obj2);
                        }
                    }
                    ArrayList arrayListM22603U0 = u91.m22603U0(gy7Var.f41526a, arrayList7);
                    Iterator it = arrayListM22603U0.iterator();
                    while (it.hasNext()) {
                        je9 je9Var2 = (je9) it.next();
                        xz7 xz7Var3 = je9Var2.f45484e;
                        int length4 = xz7Var3.f69005b >= spannableString.length() ? spannableString.length() : xz7Var3.f69005b;
                        int i6 = xz7Var3.f69004a;
                        if (i6 > length4) {
                            i6 = length4;
                        }
                        Context contextM2090R2 = readerPageFragment.m2090R();
                        LessonTextView lessonTextView3 = readerPageFragment.f28444F0;
                        if (lessonTextView3 == null) {
                            fa4.m11636J(str3);
                            throw r29;
                        }
                        spannableString.setSpan(new k3a(contextM2090R2, lessonTextView3.getLayout(), strMo4589b2, je9Var2, gy7Var.f41528c, textHighlightStyle3, false, color, iM14431n, iM14431n2, je9Var2.f45481b, je9Var2.f45480a, je9Var2.f45482c, color2, readerPageFragment.m2090R().getResources().getDimensionPixelSize(R$dimen.activity_horizontal_margin), gy7Var.f41531f), i6, length4, 33);
                        it = it;
                        arrayListM22603U0 = arrayListM22603U0;
                    }
                    ArrayList<je9> arrayList8 = arrayListM22603U0;
                    if (textHighlightStyle3 == TextHighlightStyle.ForegroundColor) {
                        for (je9 je9Var3 : arrayList8) {
                            Integer num = je9Var3.f45483d;
                            int iIntValue = num != null ? num.intValue() : jfa.m14431n(readerPageFragment.m2090R(), R$attr.colorOnSurface);
                            xz7 xz7Var4 = je9Var3.f45484e;
                            int length5 = xz7Var4.f69004a <= spannableString.length() ? xz7Var4.f69004a : spannableString.length();
                            if (xz7Var4.f69005b <= spannableString.length()) {
                                length2 = xz7Var4.f69008e.length() + length5;
                                if (length2 > spannableString.length()) {
                                    length2 = xz7Var4.f69005b;
                                }
                            } else {
                                length2 = spannableString.length();
                            }
                            spannableString.setSpan(new ForegroundColorSpan(iIntValue), length5, length2, 33);
                        }
                    }
                    for (je9 je9Var4 : arrayList8) {
                        xz7 xz7Var5 = je9Var4.f45484e;
                        int length6 = xz7Var5.f69004a <= spannableString.length() ? xz7Var5.f69004a : spannableString.length();
                        if (xz7Var5.f69005b <= spannableString.length()) {
                            length = (xz7Var5.f69008e.length() + length6) - 1;
                            if (length > spannableString.length()) {
                                length = xz7Var5.f69005b;
                            }
                        } else {
                            length = spannableString.length();
                        }
                        spannableString.setSpan(new by7(je9Var4, readerPageFragment, xz7Var5), length6, length, 17);
                    }
                    LessonTextView lessonTextView4 = readerPageFragment.f28444F0;
                    if (lessonTextView4 == null) {
                        fa4.m11636J(str3);
                        throw r29;
                    }
                    CharSequence text2 = lessonTextView4.getText();
                    text2.getClass();
                    ReaderPageFragment.m9294S0(readerPageFragment, str2, (SpannableString) text2);
                    return;
                }
                return;
            case 8:
                ReaderPageFragment readerPageFragment2 = (ReaderPageFragment) this.f47375b;
                je9 je9Var5 = (je9) this.f47376c;
                LessonTextView lessonTextView5 = readerPageFragment2.f28444F0;
                if (lessonTextView5 == null) {
                    fa4.m11636J("tvContent");
                    throw null;
                }
                CharSequence text3 = lessonTextView5.getText();
                text3.getClass();
                SpannableString spannableString2 = (SpannableString) text3;
                nu8[] nu8VarArr = (nu8[]) spannableString2.getSpans(0, spannableString2.length(), nu8.class);
                nu8VarArr.getClass();
                int length7 = nu8VarArr.length;
                while (i < length7) {
                    spannableString2.removeSpan(nu8VarArr[i]);
                    i++;
                }
                String strMo4589b3 = readerPageFragment2.m9299X0().f29223b.mo4589b2();
                if (je9Var5 != null) {
                    xz7 xz7Var6 = je9Var5.f45484e;
                    Context contextM2090R3 = readerPageFragment2.m2090R();
                    LessonTextView lessonTextView6 = readerPageFragment2.f28444F0;
                    if (lessonTextView6 == null) {
                        fa4.m11636J("tvContent");
                        throw null;
                    }
                    nu8 nu8Var = new nu8(contextM2090R3, lessonTextView6.getLayout(), strMo4589b3, je9Var5);
                    int length8 = xz7Var6.f69005b >= spannableString2.length() ? spannableString2.length() : xz7Var6.f69005b;
                    int i7 = xz7Var6.f69004a;
                    if (i7 > length8) {
                        i7 = length8;
                    }
                    spannableString2.setSpan(nu8Var, i7, length8, 33);
                    return;
                }
                return;
            case 9:
                ((sm0) this.f47376c).m21458F((yu2) this.f47375b);
                return;
            case 10:
                il7 il7Var = ((op9) this.f47376c).f54694a.f7209f;
                String str4 = (String) this.f47375b;
                synchronized (il7Var.f44277k) {
                    try {
                        C0778d c0778dM14014c = il7Var.m14014c(str4);
                        if (c0778dM14014c != null) {
                            p8bVar = c0778dM14014c.f7240a;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (p8bVar == null || !p8bVar.m18987j()) {
                    return;
                }
                synchronized (((op9) this.f47376c).f54696c) {
                    ((op9) this.f47376c).f54699f.put(acd.m270b(p8bVar), p8bVar);
                    op9 op9Var = (op9) this.f47376c;
                    ((op9) this.f47376c).f54700g.put(acd.m270b(p8bVar), AbstractC0776b.m2922a(op9Var.f54701h, p8bVar, op9Var.f54695b.f36848b, op9Var));
                    break;
                }
                return;
            case 11:
                gm0 gm0Var = (gm0) this.f47375b;
                boolean zIsCancelled = gm0Var.isCancelled();
                sm0 sm0Var = (sm0) this.f47376c;
                if (zIsCancelled) {
                    sm0Var.mo10141l(null);
                    return;
                }
                try {
                    sm0Var.resumeWith(AbstractC3632u1.m22386h(gm0Var));
                    return;
                } catch (ExecutionException e2) {
                    Throwable cause = e2.getCause();
                    if (cause != null) {
                        sm0Var.resumeWith(new Result.Failure(cause));
                        return;
                    } else {
                        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
                        fa4.m11634H(kotlinNullPointerException, fa4.class.getName());
                        throw kotlinNullPointerException;
                    }
                }
            case 12:
                wo3 wo3Var = (wo3) this.f47375b;
                nha nhaVar = (nha) this.f47376c;
                qg5 qg5Var = (qg5) wo3Var.f67120b;
                if (qg5Var == null) {
                    return;
                }
                ccd ccdVar = (ccd) qg5Var.f57757a;
                try {
                    byte[] bArr = (byte[]) nhaVar.f52742a;
                    phb phbVar = phb.f56224a;
                    int i8 = dhb.f35664a;
                    gad gadVarM12454t = gad.m12454t(bArr, phb.f56225b);
                    boolean z5 = false;
                    for (n8d n8dVar : ccdVar.f9899b.f38876f) {
                        List listM12455s = gadVarM12454t.m12455s();
                        n8dVar.getClass();
                        li1 li1Var = t9d.f62026i;
                        li1Var.getClass();
                        if (listM12455s == null || listM12455s.isEmpty()) {
                            z = false;
                        } else {
                            Iterator it2 = listM12455s.iterator();
                            z = false;
                            while (it2.hasNext()) {
                                x7d x7dVar = (x7d) li1Var.f49695a.get((String) it2.next());
                                if (x7dVar != null) {
                                    t9d t9dVar = x7dVar.f67910a;
                                    if (t9dVar.f62032e) {
                                        pc0 pc0Var = t9dVar.f62028a;
                                        if (pc0Var != null && (pc0Var.f55937a || ((xp7) pc0Var.f55941e).f68498b == 3 || t9dVar.f62035h.m21561J())) {
                                            synchronized (t9dVar) {
                                                try {
                                                    pc0 pc0Var2 = t9dVar.f62028a;
                                                    if (pc0Var2 != null) {
                                                        if (pc0Var2.f55937a) {
                                                            t9dVar.f62028a = null;
                                                            ((AtomicInteger) t9dVar.f62034g.f53173a).incrementAndGet();
                                                        } else if ((((xp7) pc0Var2.f55941e).f68498b == 3) || t9dVar.f62035h.m21561J()) {
                                                            t9dVar.f62028a = null;
                                                            ((AtomicInteger) t9dVar.f62034g.f53173a).incrementAndGet();
                                                        }
                                                    }
                                                } catch (Throwable th3) {
                                                    throw th3;
                                                }
                                            }
                                        }
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    z |= z2;
                                }
                            }
                        }
                        if (z && !z5) {
                            ccdVar.f9898a.zza();
                            z5 = true;
                        }
                    }
                    return;
                } catch (zzaeh unused) {
                    ccdVar.getClass();
                    return;
                }
            case 13:
                kc0 kc0Var = (kc0) this.f47375b;
                C3440oy c3440oy = (C3440oy) this.f47376c;
                zzjd zzjdVar = zzjd.EXECUTE_ASYNC_TIMEOUT;
                qc0 qc0Var = wwb.f67446k;
                kc0Var.m15107z(zzjdVar, 3, qc0Var);
                c3440oy.m18570e(qc0Var);
                return;
            case 14:
                Future future = (Future) this.f47375b;
                if (future.isDone() || future.isCancelled()) {
                    return;
                }
                Runnable runnable = (Runnable) this.f47376c;
                future.cancel(true);
                AbstractC0985a.m5508i("BillingClient", "Async task is taking too long, cancel it!");
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 15:
                kc0 kc0Var2 = (kc0) this.f47375b;
                C3440oy c3440oy2 = (C3440oy) this.f47376c;
                zzjd zzjdVar2 = zzjd.EXECUTE_ASYNC_TIMEOUT;
                qc0 qc0Var2 = wwb.f67446k;
                kc0Var2.m15107z(zzjdVar2, 7, qc0Var2);
                zzbw zzbwVarM5669n = zzbw.m5669n();
                zzbw.m5669n();
                fy4 fy4Var = (fy4) c3440oy2.f55160b;
                qc0Var2.getClass();
                if (qc0Var2.f57553a == 0) {
                    zzbwVarM5669n.getClass();
                    if (zzbwVarM5669n.isEmpty()) {
                        return;
                    }
                    fy4Var.invoke(zzbwVarM5669n);
                    return;
                }
                return;
            case 16:
                Callable callable = (Callable) this.f47375b;
                wr9 wr9Var = (wr9) this.f47376c;
                try {
                    wr9Var.m24138b(callable.call());
                    return;
                } catch (MlKitException e3) {
                    wr9Var.m24137a(e3);
                    return;
                } catch (Exception e4) {
                    wr9Var.m24137a(new MlKitException("Internal error has occurred when executing ML Kit tasks", e4));
                    return;
                }
            case 17:
                eoc eocVar = (eoc) this.f47376c;
                eocVar.f37647f.m5902V();
                zzah zzahVar = (zzah) this.f47375b;
                Object objZza = zzahVar.f12378c.zza();
                C1045d c1045d = eocVar.f37647f;
                if (objZza == null) {
                    c1045d.getClass();
                    String str5 = zzahVar.f12376a;
                    lda.m16130p(str5);
                    zzr zzrVarM5900Q = c1045d.m5900Q(str5);
                    if (zzrVarM5900Q != null) {
                        c1045d.m5908a0(zzahVar, zzrVarM5900Q);
                        return;
                    }
                    return;
                }
                c1045d.getClass();
                String str6 = zzahVar.f12376a;
                lda.m16130p(str6);
                zzr zzrVarM5900Q2 = c1045d.m5900Q(str6);
                if (zzrVarM5900Q2 != null) {
                    c1045d.m5906Z(zzahVar, zzrVarM5900Q2);
                    return;
                }
                return;
            case 18:
                ((C1043b) this.f47376c).m5864U((Boolean) this.f47375b, true);
                return;
            case 19:
                C1043b c1043b2 = ((AppMeasurementDynamiteService) this.f47376c).f12312f.f47414H;
                kjc.m15279k(c1043b2);
                cdb cdbVar2 = (cdb) this.f47375b;
                c1043b2.mo12359D();
                c1043b2.m13744E();
                cdb cdbVar3 = c1043b2.f12326d;
                if (cdbVar2 != cdbVar3) {
                    lda.m16132r("EventInterceptor already set.", cdbVar3 == null);
                }
                c1043b2.f12326d = cdbVar2;
                return;
            case 20:
                e4d e4dVar = (e4d) this.f47376c;
                synchronized (e4dVar) {
                    try {
                        e4dVar.f36708a = false;
                        v4d v4dVar = e4dVar.f36710c;
                        if (!v4dVar.m23120U()) {
                            xcc xccVar2 = ((kjc) v4dVar.f60774a).f47438f;
                            kjc.m15280l(xccVar2);
                            xccVar2.f68075H.m17923a("Connected to remote service");
                            q9c q9cVar = (q9c) this.f47375b;
                            v4dVar.mo12359D();
                            v4dVar.f64866d = q9cVar;
                            v4dVar.m23116Q();
                            v4dVar.m23118S();
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                    break;
                }
                v4d v4dVar2 = ((e4d) this.f47376c).f36710c;
                ScheduledExecutorService scheduledExecutorService = v4dVar2.f64869g;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    v4dVar2.f64869g = null;
                    return;
                }
                return;
            case 21:
                nr9 nr9Var = (nr9) this.f47375b;
                JobParameters jobParameters = (JobParameters) this.f47376c;
                Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
                ((i5d) ((Service) nr9Var.f53173a)).mo5842c(jobParameters);
                return;
            case 22:
                t9d t9dVar2 = (t9d) this.f47375b;
                try {
                    AbstractC1118h.m6398b((C3817z1) this.f47376c);
                    return;
                } catch (Exception e5) {
                    String str7 = t9dVar2.f62030c;
                    Log.w("FlagStore", AbstractC3393o1.m17739n(new StringBuilder(String.valueOf(str7).length() + 73), "Failed to store account on flag read for: ", str7, " which may lead to stale flags."), e5);
                    return;
                }
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                m15268a();
                return;
            default:
                this.f47375b = null;
                this.f47376c = null;
                return;
        }
    }

    public String toString() {
        switch (this.f47374a) {
            case 0:
                gv5 gv5Var = new gv5(kj3.class.getSimpleName(), 25);
                cdb cdbVar = (cdb) this.f47376c;
                p33 p33Var = new p33(11, false);
                ((p33) gv5Var.f41394d).f55514c = p33Var;
                gv5Var.f41394d = p33Var;
                p33Var.f55513b = cdbVar;
                return gv5Var.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ kj3(int i, Object obj, Object obj2) {
        this.f47374a = i;
        this.f47375b = obj;
        this.f47376c = obj2;
    }

    public /* synthetic */ kj3(Object obj, Object obj2, boolean z, int i) {
        this.f47374a = i;
        this.f47376c = obj;
        this.f47375b = obj2;
    }

    public /* synthetic */ kj3() {
        this.f47374a = 24;
    }
}
