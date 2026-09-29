package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsetsAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.media3.common.ParserException;
import com.airbnb.lottie.parser.moshi.AbstractC0875a;
import com.facebook.FacebookException;
import com.iterable.iterableapi.C1210f;
import com.iterable.iterableapi.C1212h;
import com.iterable.iterableapi.IterableActionSource;
import com.iterable.iterableapi.IterableInAppDeleteActionType;
import com.iterable.iterableapi.IterableInAppLocation;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.LqAnalyticsValues$AdjustedStat;
import com.lingq.core.analytics.data.LqAnalyticsValues$AdjustedStatAction;
import com.lingq.core.analytics.data.LqAnalyticsValues$AdjustedStatLocation;
import com.lingq.core.data.repository.C1294j;
import com.lingq.core.data.repository.C1306v;
import com.lingq.core.data.repository.C1307w;
import com.lingq.core.designsystem.R$attr;
import com.lingq.core.domain.model.language.LanguageProgressInterval;
import com.lingq.core.domain.model.language.LanguageProgressMetric;
import com.lingq.core.domain.model.language.LanguageProgressUpdate;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.domain.model.status.TokenStatus;
import com.lingq.core.domain.model.token.TokenControllerType;
import com.lingq.feature.review.C2754d;
import com.lingq.feature.token.R$id;
import com.lingq.feature.token.R$layout;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import okio.ByteString;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class p33 implements wc0, ao9, my2, st5, nt8, lr9, cn9 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55512a;

    /* JADX INFO: renamed from: b */
    public Object f55513b;

    /* JADX INFO: renamed from: c */
    public Object f55514c;

    /* JADX WARN: Code duplicated, block: B:58:0x0266 A[PHI: r5
      0x0266: PHI (r5v3 int) = 
      (r5v2 int)
      (r5v5 int)
      (r5v6 int)
      (r5v7 int)
      (r5v8 int)
      (r5v9 int)
      (r5v10 int)
      (r5v11 int)
      (r5v12 int)
      (r5v13 int)
      (r5v14 int)
      (r5v15 int)
     binds: [B:3:0x003a, B:5:0x0044, B:7:0x004e, B:9:0x0058, B:11:0x0062, B:13:0x006c, B:15:0x0076, B:17:0x0080, B:19:0x008a, B:21:0x0094, B:23:0x009e, B:25:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    public p33(vs3 vs3Var, View view, TokenControllerType tokenControllerType, C2754d c2754d) throws Throwable {
        Throwable th;
        this.f55512a = 24;
        vs3Var.getClass();
        yd5 yd5Var = vs3Var.f65847c;
        tokenControllerType.getClass();
        this.f55513b = view;
        this.f55514c = c2754d;
        Object systemService = view.getContext().getSystemService("layout_inflater");
        systemService.getClass();
        View viewInflate = ((LayoutInflater) systemService).inflate(R$layout.menu_card_progress, (ViewGroup) null, false);
        int i = R$id.btnProgressFamiliar;
        TextView textView = (TextView) lfa.m16159c(viewInflate, i);
        if (textView != null) {
            i = R$id.btnProgressIgnore;
            ImageButton imageButton = (ImageButton) lfa.m16159c(viewInflate, i);
            if (imageButton != null) {
                i = R$id.btnProgressKnown;
                ImageButton imageButton2 = (ImageButton) lfa.m16159c(viewInflate, i);
                if (imageButton2 != null) {
                    i = R$id.btnProgressLearned;
                    TextView textView2 = (TextView) lfa.m16159c(viewInflate, i);
                    if (textView2 != null) {
                        i = R$id.btnProgressNew;
                        TextView textView3 = (TextView) lfa.m16159c(viewInflate, i);
                        if (textView3 != null) {
                            i = R$id.btnProgressRecognized;
                            TextView textView4 = (TextView) lfa.m16159c(viewInflate, i);
                            if (textView4 != null) {
                                i = R$id.tvProgressFamiliar;
                                if (((TextView) lfa.m16159c(viewInflate, i)) != null) {
                                    i = R$id.tvProgressIgnore;
                                    if (((TextView) lfa.m16159c(viewInflate, i)) != null) {
                                        i = R$id.tvProgressKnown;
                                        if (((TextView) lfa.m16159c(viewInflate, i)) != null) {
                                            i = R$id.tvProgressLearned;
                                            if (((TextView) lfa.m16159c(viewInflate, i)) != null) {
                                                i = R$id.tvProgressNew;
                                                if (((TextView) lfa.m16159c(viewInflate, i)) != null) {
                                                    i = R$id.tvProgressRecognized;
                                                    if (((TextView) lfa.m16159c(viewInflate, i)) != null) {
                                                        CardView cardView = (CardView) viewInflate;
                                                        int i2 = R$id.viewProgressFamiliar;
                                                        LinearLayout linearLayout = (LinearLayout) lfa.m16159c(viewInflate, i2);
                                                        if (linearLayout != null) {
                                                            i2 = R$id.viewProgressIgnore;
                                                            th = null;
                                                            LinearLayout linearLayout2 = (LinearLayout) lfa.m16159c(viewInflate, i2);
                                                            if (linearLayout2 != null) {
                                                                i2 = R$id.viewProgressKnown;
                                                                LinearLayout linearLayout3 = (LinearLayout) lfa.m16159c(viewInflate, i2);
                                                                if (linearLayout3 != null) {
                                                                    int i3 = R$id.viewProgressLearned;
                                                                    int i4 = i3;
                                                                    LinearLayout linearLayout4 = (LinearLayout) lfa.m16159c(viewInflate, i3);
                                                                    if (linearLayout4 != null) {
                                                                        int i5 = R$id.viewProgressNew;
                                                                        i4 = i5;
                                                                        LinearLayout linearLayout5 = (LinearLayout) lfa.m16159c(viewInflate, i5);
                                                                        if (linearLayout5 != null) {
                                                                            int i6 = R$id.viewProgressRecognized;
                                                                            i4 = i6;
                                                                            LinearLayout linearLayout6 = (LinearLayout) lfa.m16159c(viewInflate, i6);
                                                                            if (linearLayout6 != null) {
                                                                                final int i7 = 1;
                                                                                final PopupWindow popupWindow = new PopupWindow((View) cardView, -2, -2, true);
                                                                                final int i8 = 0;
                                                                                linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: d5a
                                                                                    @Override // android.view.View.OnClickListener
                                                                                    public final void onClick(View view2) {
                                                                                        int i9 = i8;
                                                                                        p33 p33Var = this;
                                                                                        PopupWindow popupWindow2 = popupWindow;
                                                                                        switch (i9) {
                                                                                            case 0:
                                                                                                popupWindow2.dismiss();
                                                                                                ((C2754d) p33Var.f55514c).invoke(TokenStatus.Ignored);
                                                                                                break;
                                                                                            case 1:
                                                                                                popupWindow2.dismiss();
                                                                                                ((C2754d) p33Var.f55514c).invoke(TokenStatus.Known);
                                                                                                break;
                                                                                            case 2:
                                                                                                popupWindow2.dismiss();
                                                                                                ((C2754d) p33Var.f55514c).invoke(TokenStatus.New);
                                                                                                break;
                                                                                            case 3:
                                                                                                popupWindow2.dismiss();
                                                                                                ((C2754d) p33Var.f55514c).invoke(TokenStatus.Recognized);
                                                                                                break;
                                                                                            case 4:
                                                                                                popupWindow2.dismiss();
                                                                                                ((C2754d) p33Var.f55514c).invoke(TokenStatus.Familiar);
                                                                                                break;
                                                                                            default:
                                                                                                popupWindow2.dismiss();
                                                                                                ((C2754d) p33Var.f55514c).invoke(TokenStatus.Learned);
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                });
                                                                                linearLayout3.setOnClickListener(new View.OnClickListener() { // from class: d5a
                                                                                    @Override // android.view.View.OnClickListener
                                                                                    public final void onClick(View view2) {
                                                                                        int i9 = i7;
                                                                                        p33 p33Var = this;
                                                                                        PopupWindow popupWindow2 = popupWindow;
                                                                                        switch (i9) {
                                                                                            case 0:
                                                                                                popupWindow2.dismiss();
                                                                                                ((C2754d) p33Var.f55514c).invoke(TokenStatus.Ignored);
                                                                                                break;
                                                                                            case 1:
                                                                                                popupWindow2.dismiss();
                                                                                                ((C2754d) p33Var.f55514c).invoke(TokenStatus.Known);
                                                                                                break;
                                                                                            case 2:
                                                                                                popupWindow2.dismiss();
                                                                                                ((C2754d) p33Var.f55514c).invoke(TokenStatus.New);
                                                                                                break;
                                                                                            case 3:
                                                                                                popupWindow2.dismiss();
                                                                                                ((C2754d) p33Var.f55514c).invoke(TokenStatus.Recognized);
                                                                                                break;
                                                                                            case 4:
                                                                                                popupWindow2.dismiss();
                                                                                                ((C2754d) p33Var.f55514c).invoke(TokenStatus.Familiar);
                                                                                                break;
                                                                                            default:
                                                                                                popupWindow2.dismiss();
                                                                                                ((C2754d) p33Var.f55514c).invoke(TokenStatus.Learned);
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                });
                                                                                final int i9 = 2;
                                                                                linearLayout5.setOnClickListener(new View.OnClickListener() { // from class: d5a
                                                                                    @Override // android.view.View.OnClickListener
                                                                                    public final void onClick(View view2) {
                                                                                        int i10 = i9;
                                                                                        p33 p33Var = this;
                                                                                        PopupWindow popupWindow2 = popupWindow;
                                                                                        switch (i10) {
                                                                                            case 0:
                                                                                                popupWindow2.dismiss();
                                                                                                ((C2754d) p33Var.f55514c).invoke(TokenStatus.Ignored);
                                                                                                break;
                                                                                            case 1:
                                                                                                popupWindow2.dismiss();
                                                                                                ((C2754d) p33Var.f55514c).invoke(TokenStatus.Known);
                                                                                                break;
                                                                                            case 2:
                                                                                                popupWindow2.dismiss();
                                                                                                ((C2754d) p33Var.f55514c).invoke(TokenStatus.New);
                                                                                                break;
                                                                                            case 3:
                                                                                                popupWindow2.dismiss();
                                                                                                ((C2754d) p33Var.f55514c).invoke(TokenStatus.Recognized);
                                                                                                break;
                                                                                            case 4:
                                                                                                popupWindow2.dismiss();
                                                                                                ((C2754d) p33Var.f55514c).invoke(TokenStatus.Familiar);
                                                                                                break;
                                                                                            default:
                                                                                                popupWindow2.dismiss();
                                                                                                ((C2754d) p33Var.f55514c).invoke(TokenStatus.Learned);
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                });
                                                                                final int i10 = 3;
                                                                                linearLayout6.setOnClickListener(new View.OnClickListener() { // from class: d5a
                                                                                    @Override // android.view.View.OnClickListener
                                                                                    public final void onClick(View view2) {
                                                                                        int i11 = i10;
                                                                                        p33 p33Var = this;
                                                                                        PopupWindow popupWindow2 = popupWindow;
                                                                                        switch (i11) {
                                                                                            case 0:
                                                                                                popupWindow2.dismiss();
                                                                                                ((C2754d) p33Var.f55514c).invoke(TokenStatus.Ignored);
                                                                                                break;
                                                                                            case 1:
                                                                                                popupWindow2.dismiss();
                                                                                                ((C2754d) p33Var.f55514c).invoke(TokenStatus.Known);
                                                                                                break;
                                                                                            case 2:
                                                                                                popupWindow2.dismiss();
                                                                                                ((C2754d) p33Var.f55514c).invoke(TokenStatus.New);
                                                                                                break;
                                                                                            case 3:
                                                                                                popupWindow2.dismiss();
                                                                                                ((C2754d) p33Var.f55514c).invoke(TokenStatus.Recognized);
                                                                                                break;
                                                                                            case 4:
                                                                                                popupWindow2.dismiss();
                                                                                                ((C2754d) p33Var.f55514c).invoke(TokenStatus.Familiar);
                                                                                                break;
                                                                                            default:
                                                                                                popupWindow2.dismiss();
                                                                                                ((C2754d) p33Var.f55514c).invoke(TokenStatus.Learned);
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                });
                                                                                final int i11 = 4;
                                                                                linearLayout.setOnClickListener(new View.OnClickListener() { // from class: d5a
                                                                                    @Override // android.view.View.OnClickListener
                                                                                    public final void onClick(View view2) {
                                                                                        int i12 = i11;
                                                                                        p33 p33Var = this;
                                                                                        PopupWindow popupWindow2 = popupWindow;
                                                                                        switch (i12) {
                                                                                            case 0:
                                                                                                popupWindow2.dismiss();
                                                                                                ((C2754d) p33Var.f55514c).invoke(TokenStatus.Ignored);
                                                                                                break;
                                                                                            case 1:
                                                                                                popupWindow2.dismiss();
                                                                                                ((C2754d) p33Var.f55514c).invoke(TokenStatus.Known);
                                                                                                break;
                                                                                            case 2:
                                                                                                popupWindow2.dismiss();
                                                                                                ((C2754d) p33Var.f55514c).invoke(TokenStatus.New);
                                                                                                break;
                                                                                            case 3:
                                                                                                popupWindow2.dismiss();
                                                                                                ((C2754d) p33Var.f55514c).invoke(TokenStatus.Recognized);
                                                                                                break;
                                                                                            case 4:
                                                                                                popupWindow2.dismiss();
                                                                                                ((C2754d) p33Var.f55514c).invoke(TokenStatus.Familiar);
                                                                                                break;
                                                                                            default:
                                                                                                popupWindow2.dismiss();
                                                                                                ((C2754d) p33Var.f55514c).invoke(TokenStatus.Learned);
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                });
                                                                                final int i12 = 5;
                                                                                linearLayout4.setOnClickListener(new View.OnClickListener() { // from class: d5a
                                                                                    @Override // android.view.View.OnClickListener
                                                                                    public final void onClick(View view2) {
                                                                                        int i13 = i12;
                                                                                        p33 p33Var = this;
                                                                                        PopupWindow popupWindow2 = popupWindow;
                                                                                        switch (i13) {
                                                                                            case 0:
                                                                                                popupWindow2.dismiss();
                                                                                                ((C2754d) p33Var.f55514c).invoke(TokenStatus.Ignored);
                                                                                                break;
                                                                                            case 1:
                                                                                                popupWindow2.dismiss();
                                                                                                ((C2754d) p33Var.f55514c).invoke(TokenStatus.Known);
                                                                                                break;
                                                                                            case 2:
                                                                                                popupWindow2.dismiss();
                                                                                                ((C2754d) p33Var.f55514c).invoke(TokenStatus.New);
                                                                                                break;
                                                                                            case 3:
                                                                                                popupWindow2.dismiss();
                                                                                                ((C2754d) p33Var.f55514c).invoke(TokenStatus.Recognized);
                                                                                                break;
                                                                                            case 4:
                                                                                                popupWindow2.dismiss();
                                                                                                ((C2754d) p33Var.f55514c).invoke(TokenStatus.Familiar);
                                                                                                break;
                                                                                            default:
                                                                                                popupWindow2.dismiss();
                                                                                                ((C2754d) p33Var.f55514c).invoke(TokenStatus.Learned);
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                });
                                                                                Context context = view.getContext();
                                                                                context.getClass();
                                                                                ppc.m19444c(context, CardStatus.Ignored.getValue(), imageButton);
                                                                                Context context2 = view.getContext();
                                                                                context2.getClass();
                                                                                ppc.m19444c(context2, CardStatus.Known.getValue(), imageButton2);
                                                                                ppc.m19445d(textView3, abd.m253i(yd5Var.f69687a.f67242a));
                                                                                ppc.m19445d(textView4, abd.m253i(yd5Var.f69688b.f67242a));
                                                                                ppc.m19445d(textView, abd.m253i(yd5Var.f69689c.f67242a));
                                                                                Context context3 = view.getContext();
                                                                                context3.getClass();
                                                                                ppc.m19445d(textView2, jfa.m14431n(context3, R$attr.loadingColor));
                                                                                Context context4 = view.getContext();
                                                                                context4.getClass();
                                                                                ppc.m19445d(imageButton, jfa.m14431n(context4, R$attr.loadingColor));
                                                                                Context context5 = view.getContext();
                                                                                context5.getClass();
                                                                                ppc.m19445d(imageButton2, jfa.m14431n(context5, R$attr.loadingColor));
                                                                                textView3.setActivated(true);
                                                                                textView4.setActivated(true);
                                                                                textView.setActivated(true);
                                                                                textView2.setActivated(true);
                                                                                imageButton2.setActivated(true);
                                                                                imageButton.setActivated(true);
                                                                                int[] iArr = new int[2];
                                                                                view.getLocationInWindow(iArr);
                                                                                int i13 = iArr[1];
                                                                                int i14 = view.getContext().getResources().getDisplayMetrics().heightPixels;
                                                                                popupWindow.getContentView().measure(-2, -2);
                                                                                popupWindow.setWidth(popupWindow.getContentView().getMeasuredWidth());
                                                                                popupWindow.setHeight(popupWindow.getContentView().getMeasuredHeight());
                                                                                int height = popupWindow.getHeight() / 2;
                                                                                int i15 = i13 + height;
                                                                                int i16 = i14 - i15;
                                                                                int i17 = i13 - height;
                                                                                if (tokenControllerType == TokenControllerType.Lesson) {
                                                                                    if (i15 <= i14) {
                                                                                        popupWindow.showAsDropDown(view, -(view.getMeasuredHeight() / 2), -height);
                                                                                        return;
                                                                                    } else {
                                                                                        if (i17 >= 0) {
                                                                                            popupWindow.showAsDropDown(view, -(view.getMeasuredHeight() / 2), (-i15) + i16);
                                                                                            return;
                                                                                        }
                                                                                        popupWindow.showAsDropDown(view, -(view.getMeasuredHeight() / 2), Math.abs(i17) + (-i15));
                                                                                        return;
                                                                                    }
                                                                                }
                                                                                if (tokenControllerType == TokenControllerType.Vocabulary || tokenControllerType == TokenControllerType.Review) {
                                                                                    if (i15 <= i14) {
                                                                                        popupWindow.showAsDropDown(view, view.getMeasuredWidth(), 0);
                                                                                        return;
                                                                                    } else if (i17 < 0) {
                                                                                        popupWindow.showAsDropDown(view, view.getMeasuredWidth(), -i15);
                                                                                        return;
                                                                                    } else {
                                                                                        popupWindow.showAsDropDown(view, view.getMeasuredWidth(), -(view.getMeasuredHeight() + height));
                                                                                        return;
                                                                                    }
                                                                                }
                                                                                return;
                                                                            }
                                                                        }
                                                                    }
                                                                    i = i4;
                                                                }
                                                            }
                                                        } else {
                                                            th = null;
                                                        }
                                                        i = i2;
                                                    } else {
                                                        th = null;
                                                    }
                                                } else {
                                                    th = null;
                                                }
                                            } else {
                                                th = null;
                                            }
                                        } else {
                                            th = null;
                                        }
                                    } else {
                                        th = null;
                                    }
                                } else {
                                    th = null;
                                }
                            } else {
                                th = null;
                            }
                        } else {
                            th = null;
                        }
                    } else {
                        th = null;
                    }
                } else {
                    th = null;
                }
            } else {
                th = null;
            }
        } else {
            th = null;
        }
        C3386nv.m17635v("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw th;
    }

    /* JADX INFO: renamed from: L */
    public static int m18863L(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003a A[Catch: IOException -> 0x006c, TryCatch #0 {IOException -> 0x006c, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:25:0x005b), top: B:30:0x0000 }] */
    /* JADX INFO: renamed from: S */
    public static p33 m18864S(String... strArr) {
        String str;
        try {
            ByteString[] byteStringArr = new ByteString[strArr.length];
            aj0 aj0Var = new aj0();
            for (int i = 0; i < strArr.length; i++) {
                String str2 = strArr[i];
                String[] strArr2 = AbstractC0875a.f10735e;
                aj0Var.m487k0(34);
                int length = str2.length();
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    char cCharAt = str2.charAt(i3);
                    if (cCharAt < 128) {
                        str = strArr2[cCharAt];
                        if (str != null) {
                            if (i2 < i3) {
                                aj0Var.m493p0(i2, str2, i3);
                            }
                            aj0Var.m495q0(str);
                            i2 = i3 + 1;
                        }
                    } else {
                        if (cCharAt == 8232) {
                            str = "\\u2028";
                        } else if (cCharAt == 8233) {
                            str = "\\u2029";
                        }
                        if (i2 < i3) {
                            aj0Var.m493p0(i2, str2, i3);
                        }
                        aj0Var.m495q0(str);
                        i2 = i3 + 1;
                    }
                }
                if (i2 < length) {
                    aj0Var.m493p0(i2, str2, length);
                }
                aj0Var.m487k0(34);
                aj0Var.readByte();
                byteStringArr[i] = aj0Var.mo497s(aj0Var.f723b);
            }
            return new p33(7, (String[]) strArr.clone(), do7.m10547w(byteStringArr));
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // p000.st5
    /* JADX INFO: renamed from: A */
    public ByteBuffer mo10711A(int i) {
        return ((MediaCodec) this.f55513b).getOutputBuffer(i);
    }

    @Override // p000.st5
    /* JADX INFO: renamed from: B */
    public void mo10712B(ArrayList arrayList) {
        ((MediaCodec) this.f55513b).subscribeToVendorParameters(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:130:0x024d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0258  */
    /* JADX WARN: Code duplicated, block: B:133:0x0261  */
    /* JADX WARN: Code duplicated, block: B:134:0x026b  */
    /* JADX WARN: Code duplicated, block: B:136:0x0273  */
    /* JADX WARN: Code duplicated, block: B:138:0x027b  */
    /* JADX WARN: Code duplicated, block: B:139:0x027f  */
    /* JADX WARN: Code duplicated, block: B:141:0x0287  */
    /* JADX WARN: Code duplicated, block: B:142:0x028d  */
    /* JADX WARN: Code duplicated, block: B:144:0x0295  */
    /* JADX WARN: Code duplicated, block: B:150:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:152:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:154:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:156:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:157:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:159:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:160:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:162:0x02da  */
    /* JADX WARN: Code duplicated, block: B:164:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:165:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:167:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:169:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:170:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:172:0x0304  */
    /* JADX WARN: Code duplicated, block: B:174:0x0314  */
    /* JADX WARN: Code duplicated, block: B:175:0x032d  */
    /* JADX WARN: Code duplicated, block: B:178:0x033e  */
    /* JADX WARN: Code duplicated, block: B:181:0x0347  */
    /* JADX WARN: Code duplicated, block: B:182:0x0349  */
    /* JADX WARN: Code duplicated, block: B:185:0x0352  */
    /* JADX WARN: Code duplicated, block: B:186:0x0354  */
    /* JADX WARN: Code duplicated, block: B:189:0x035d  */
    /* JADX WARN: Code duplicated, block: B:193:0x0365  */
    /* JADX WARN: Code duplicated, block: B:194:0x036a  */
    /* JADX WARN: Code duplicated, block: B:195:0x036f  */
    /* JADX WARN: Code duplicated, block: B:197:0x0382  */
    /* JADX WARN: Code duplicated, block: B:250:0x0361 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:174:0x0314, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v27 */
    @Override // p000.cn9
    /* JADX INFO: renamed from: C */
    public void mo4902C(byte[] bArr, int i, int i2, kk1 kk1Var) {
        u3b u3bVarM25429d;
        String strTrim;
        String string;
        Matcher matcher;
        String strGroup;
        byte b;
        int i3;
        boolean z;
        p33 p33Var = this;
        k47 k47Var = (k47) p33Var.f55513b;
        k47Var.m14816K(i + i2, bArr);
        k47Var.m14818M(i);
        ArrayList arrayList = new ArrayList();
        try {
            a4b.m120c(k47Var);
            while (!TextUtils.isEmpty(k47Var.m14830n(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                boolean z2 = false;
                int i4 = -1;
                int i5 = 0;
                byte b2 = -1;
                while (true) {
                    int i6 = 1;
                    if (b2 == -1) {
                        i5 = k47Var.f46701b;
                        String strM14830n = k47Var.m14830n(StandardCharsets.UTF_8);
                        if (strM14830n == null) {
                            b2 = 0;
                        } else if ("STYLE".equals(strM14830n)) {
                            b2 = 2;
                        } else {
                            b2 = strM14830n.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                        }
                    } else {
                        k47Var.m14818M(i5);
                        if (b2 == 0) {
                            mq7 mq7Var = new mq7(arrayList2);
                            for (int i7 = 0; i7 < mq7Var.mo4454l(); i7++) {
                                long jMo4447c = mq7Var.mo4447c(i7);
                                List listMo4453i = mq7Var.mo4453i(jMo4447c);
                                if (!((ArrayList) listMo4453i).isEmpty()) {
                                    if (i7 == mq7Var.mo4454l() - 1) {
                                        uk9.m22770c();
                                        return;
                                    }
                                    long jMo4447c2 = mq7Var.mo4447c(i7 + 1) - mq7Var.mo4447c(i7);
                                    if (jMo4447c2 > 0) {
                                        kk1Var.accept(new gs1(jMo4447c, jMo4447c2, listMo4453i));
                                    }
                                }
                            }
                            return;
                        }
                        if (b2 == 1) {
                            while (!TextUtils.isEmpty(k47Var.m14830n(StandardCharsets.UTF_8))) {
                            }
                        } else {
                            String str = null;
                            if (b2 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    C3386nv.m17626m("A style block was found after the first cue.");
                                    return;
                                }
                                k47Var.m14830n(StandardCharsets.UTF_8);
                                s3b s3bVar = (s3b) p33Var.f55514c;
                                k47 k47Var2 = s3bVar.f60248a;
                                StringBuilder sb = s3bVar.f60249b;
                                sb.setLength(0);
                                int i8 = k47Var.f46701b;
                                while (!TextUtils.isEmpty(k47Var.m14830n(StandardCharsets.UTF_8))) {
                                }
                                k47Var2.m14816K(k47Var.f46701b, k47Var.f46700a);
                                k47Var2.m14818M(i8);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    s3b.m21056c(k47Var2);
                                    if (k47Var2.m14820a() >= 5 && "::cue".equals(k47Var2.m14840x(5, StandardCharsets.UTF_8))) {
                                        int i9 = k47Var2.f46701b;
                                        String strM21055b = s3b.m21055b(k47Var2, sb);
                                        if (strM21055b == null) {
                                            strTrim = str;
                                        } else if ("{".equals(strM21055b)) {
                                            k47Var2.m14818M(i9);
                                            strTrim = "";
                                        } else {
                                            if ("(".equals(strM21055b)) {
                                                int i10 = k47Var2.f46701b;
                                                int i11 = k47Var2.f46702c;
                                                int i12 = z2 ? 1 : 0;
                                                while (i10 < i11 && i12 == 0) {
                                                    int i13 = i10 + 1;
                                                    i12 = ((char) k47Var2.f46700a[i10]) == ')' ? i6 : z2 ? 1 : 0;
                                                    i10 = i13;
                                                }
                                                strTrim = k47Var2.m14840x((i10 - 1) - k47Var2.f46701b, StandardCharsets.UTF_8).trim();
                                            } else {
                                                strTrim = str;
                                            }
                                            if (!")".equals(s3b.m21055b(k47Var2, sb))) {
                                                strTrim = str;
                                            }
                                        }
                                    } else {
                                        strTrim = str;
                                    }
                                    if (strTrim != null && "{".equals(s3b.m21055b(k47Var2, sb))) {
                                        t3b t3bVar = new t3b();
                                        t3bVar.f61814a = "";
                                        t3bVar.f61815b = "";
                                        t3bVar.f61816c = Collections.EMPTY_SET;
                                        t3bVar.f61817d = "";
                                        t3bVar.f61818e = str;
                                        t3bVar.f61820g = z2;
                                        t3bVar.f61822i = z2;
                                        t3bVar.f61823j = i4;
                                        t3bVar.f61824k = i4;
                                        t3bVar.f61825l = i4;
                                        t3bVar.f61826m = i4;
                                        t3bVar.f61827n = i4;
                                        t3bVar.f61829p = i4;
                                        t3bVar.f61830q = z2;
                                        if (!strTrim.isEmpty()) {
                                            int iIndexOf = strTrim.indexOf(91);
                                            if (iIndexOf != i4) {
                                                Matcher matcher2 = s3b.f60246c.matcher(strTrim.substring(iIndexOf));
                                                if (matcher2.matches()) {
                                                    String strGroup2 = matcher2.group(i6);
                                                    strGroup2.getClass();
                                                    t3bVar.f61817d = strGroup2;
                                                }
                                                strTrim = strTrim.substring(z2 ? 1 : 0, iIndexOf);
                                            }
                                            String str2 = uma.f64080a;
                                            String[] strArrSplit = strTrim.split("\\.", i4);
                                            String str3 = strArrSplit[z2 ? 1 : 0];
                                            int iIndexOf2 = str3.indexOf(35);
                                            if (iIndexOf2 != i4) {
                                                t3bVar.f61815b = str3.substring(z2 ? 1 : 0, iIndexOf2);
                                                t3bVar.f61814a = str3.substring(iIndexOf2 + 1);
                                            } else {
                                                t3bVar.f61815b = str3;
                                            }
                                            if (strArrSplit.length > i6) {
                                                int length = strArrSplit.length;
                                                bna.m3969q(length <= strArrSplit.length ? i6 : z2 ? 1 : 0);
                                                t3bVar.f61816c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(strArrSplit, i6, length)));
                                            }
                                        }
                                        ?? r8 = z2 ? 1 : 0;
                                        String strM21055b2 = str;
                                        while (r8 == 0) {
                                            int i14 = k47Var2.f46701b;
                                            strM21055b2 = s3b.m21055b(k47Var2, sb);
                                            ?? r15 = (strM21055b2 == null || "}".equals(strM21055b2)) ? i6 : z2;
                                            if (r15 == 0) {
                                                k47Var2.m14818M(i14);
                                                s3b.m21056c(k47Var2);
                                                String strM21054a = s3b.m21054a(k47Var2, sb);
                                                if (!strM21054a.isEmpty() && ":".equals(s3b.m21055b(k47Var2, sb))) {
                                                    s3b.m21056c(k47Var2);
                                                    StringBuilder sb2 = new StringBuilder();
                                                    boolean z3 = false;
                                                    while (true) {
                                                        if (z3) {
                                                            string = sb2.toString();
                                                        } else {
                                                            int i15 = k47Var2.f46701b;
                                                            String strM21055b3 = s3b.m21055b(k47Var2, sb);
                                                            if (strM21055b3 == null) {
                                                                string = null;
                                                            } else if ("}".equals(strM21055b3) || ";".equals(strM21055b3)) {
                                                                k47Var2.m14818M(i15);
                                                                z3 = true;
                                                            } else {
                                                                sb2.append(strM21055b3);
                                                            }
                                                        }
                                                    }
                                                    if (string != null && !string.isEmpty()) {
                                                        int i16 = k47Var2.f46701b;
                                                        String strM21055b4 = s3b.m21055b(k47Var2, sb);
                                                        if (";".equals(strM21055b4)) {
                                                            if ("color".equals(strM21054a)) {
                                                                t3bVar.f61819f = la1.m16038a(string, true);
                                                                t3bVar.f61820g = true;
                                                            } else if ("background-color".equals(strM21054a)) {
                                                                t3bVar.f61821h = la1.m16038a(string, true);
                                                                t3bVar.f61822i = true;
                                                            } else if ("ruby-position".equals(strM21054a)) {
                                                                if ("over".equals(string)) {
                                                                    t3bVar.f61829p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    t3bVar.f61829p = 2;
                                                                }
                                                            } else if ("text-combine-upright".equals(strM21054a)) {
                                                                if ("all".equals(string)) {
                                                                    z = true;
                                                                } else {
                                                                    z = true;
                                                                }
                                                                t3bVar.f61830q = z;
                                                            } else if ("text-decoration".equals(strM21054a)) {
                                                                if ("underline".equals(string)) {
                                                                    t3bVar.f61824k = 1;
                                                                }
                                                            } else if ("font-family".equals(strM21054a)) {
                                                                t3bVar.f61818e = AbstractC3584sr.m21625f0(string);
                                                            } else if ("font-weight".equals(strM21054a)) {
                                                                if ("bold".equals(string)) {
                                                                    t3bVar.f61825l = 1;
                                                                }
                                                            } else if ("font-style".equals(strM21054a)) {
                                                                if ("italic".equals(string)) {
                                                                    t3bVar.f61826m = 1;
                                                                }
                                                            } else if ("font-size".equals(strM21054a)) {
                                                                matcher = s3b.f60247d.matcher(AbstractC3584sr.m21625f0(string));
                                                                if (matcher.matches()) {
                                                                    strGroup = matcher.group(2);
                                                                    strGroup.getClass();
                                                                    switch (strGroup.hashCode()) {
                                                                        case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                                            if (!strGroup.equals("%")) {
                                                                                b = 0;
                                                                            }
                                                                            switch (b) {
                                                                                case 0:
                                                                                    i3 = 1;
                                                                                    t3bVar.f61827n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i3 = 1;
                                                                                    t3bVar.f61827n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i3 = 1;
                                                                                    t3bVar.f61827n = 1;
                                                                                    break;
                                                                                default:
                                                                                    uk9.m22770c();
                                                                                    return;
                                                                            }
                                                                            String strGroup3 = matcher.group(i3);
                                                                            strGroup3.getClass();
                                                                            t3bVar.f61828o = Float.parseFloat(strGroup3);
                                                                            break;
                                                                        case 3240:
                                                                            if (!strGroup.equals("em")) {
                                                                                b = 1;
                                                                            }
                                                                            switch (b) {
                                                                                case 0:
                                                                                    i3 = 1;
                                                                                    t3bVar.f61827n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i3 = 1;
                                                                                    t3bVar.f61827n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i3 = 1;
                                                                                    t3bVar.f61827n = 1;
                                                                                    break;
                                                                                default:
                                                                                    uk9.m22770c();
                                                                                    return;
                                                                            }
                                                                            String strGroup4 = matcher.group(i3);
                                                                            strGroup4.getClass();
                                                                            t3bVar.f61828o = Float.parseFloat(strGroup4);
                                                                            break;
                                                                        case 3592:
                                                                            if (!strGroup.equals("px")) {
                                                                                b = 2;
                                                                            }
                                                                            switch (b) {
                                                                                case 0:
                                                                                    i3 = 1;
                                                                                    t3bVar.f61827n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i3 = 1;
                                                                                    t3bVar.f61827n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i3 = 1;
                                                                                    t3bVar.f61827n = 1;
                                                                                    break;
                                                                                default:
                                                                                    uk9.m22770c();
                                                                                    return;
                                                                            }
                                                                            String strGroup5 = matcher.group(i3);
                                                                            strGroup5.getClass();
                                                                            t3bVar.f61828o = Float.parseFloat(strGroup5);
                                                                            break;
                                                                    }
                                                                    b = -1;
                                                                    switch (b) {
                                                                        case 0:
                                                                            i3 = 1;
                                                                            t3bVar.f61827n = 3;
                                                                            break;
                                                                        case 1:
                                                                            i3 = 1;
                                                                            t3bVar.f61827n = 2;
                                                                            break;
                                                                        case 2:
                                                                            i3 = 1;
                                                                            t3bVar.f61827n = 1;
                                                                            break;
                                                                        default:
                                                                            uk9.m22770c();
                                                                            return;
                                                                    }
                                                                    String strGroup6 = matcher.group(i3);
                                                                    strGroup6.getClass();
                                                                    t3bVar.f61828o = Float.parseFloat(strGroup6);
                                                                } else {
                                                                    ss5.m21707d0("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                }
                                                            }
                                                        } else if ("}".equals(strM21055b4)) {
                                                            k47Var2.m14818M(i16);
                                                            if ("color".equals(strM21054a)) {
                                                                t3bVar.f61819f = la1.m16038a(string, true);
                                                                t3bVar.f61820g = true;
                                                            } else if ("background-color".equals(strM21054a)) {
                                                                t3bVar.f61821h = la1.m16038a(string, true);
                                                                t3bVar.f61822i = true;
                                                            } else if ("ruby-position".equals(strM21054a)) {
                                                                if ("over".equals(string)) {
                                                                    t3bVar.f61829p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    t3bVar.f61829p = 2;
                                                                }
                                                            } else if ("text-combine-upright".equals(strM21054a)) {
                                                                if ("all".equals(string) || string.startsWith("digits")) {
                                                                    z = true;
                                                                } else {
                                                                    z = false;
                                                                }
                                                                t3bVar.f61830q = z;
                                                            } else if ("text-decoration".equals(strM21054a)) {
                                                                if ("underline".equals(string)) {
                                                                    t3bVar.f61824k = 1;
                                                                }
                                                            } else if ("font-family".equals(strM21054a)) {
                                                                t3bVar.f61818e = AbstractC3584sr.m21625f0(string);
                                                            } else if ("font-weight".equals(strM21054a)) {
                                                                if ("bold".equals(string)) {
                                                                    t3bVar.f61825l = 1;
                                                                }
                                                            } else if ("font-style".equals(strM21054a)) {
                                                                if ("italic".equals(string)) {
                                                                    t3bVar.f61826m = 1;
                                                                }
                                                            } else if ("font-size".equals(strM21054a)) {
                                                                matcher = s3b.f60247d.matcher(AbstractC3584sr.m21625f0(string));
                                                                if (matcher.matches()) {
                                                                    ss5.m21707d0("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                } else {
                                                                    strGroup = matcher.group(2);
                                                                    strGroup.getClass();
                                                                    switch (strGroup.hashCode()) {
                                                                        case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                                            if (!strGroup.equals("%")) {
                                                                                b = 0;
                                                                            }
                                                                            switch (b) {
                                                                                case 0:
                                                                                    i3 = 1;
                                                                                    t3bVar.f61827n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i3 = 1;
                                                                                    t3bVar.f61827n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i3 = 1;
                                                                                    t3bVar.f61827n = 1;
                                                                                    break;
                                                                                default:
                                                                                    uk9.m22770c();
                                                                                    return;
                                                                            }
                                                                            String strGroup7 = matcher.group(i3);
                                                                            strGroup7.getClass();
                                                                            t3bVar.f61828o = Float.parseFloat(strGroup7);
                                                                            break;
                                                                        case 3240:
                                                                            if (!strGroup.equals("em")) {
                                                                                b = 1;
                                                                            }
                                                                            switch (b) {
                                                                                case 0:
                                                                                    i3 = 1;
                                                                                    t3bVar.f61827n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i3 = 1;
                                                                                    t3bVar.f61827n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i3 = 1;
                                                                                    t3bVar.f61827n = 1;
                                                                                    break;
                                                                                default:
                                                                                    uk9.m22770c();
                                                                                    return;
                                                                            }
                                                                            String strGroup8 = matcher.group(i3);
                                                                            strGroup8.getClass();
                                                                            t3bVar.f61828o = Float.parseFloat(strGroup8);
                                                                            break;
                                                                        case 3592:
                                                                            if (!strGroup.equals("px")) {
                                                                                b = 2;
                                                                            }
                                                                            switch (b) {
                                                                                case 0:
                                                                                    i3 = 1;
                                                                                    t3bVar.f61827n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i3 = 1;
                                                                                    t3bVar.f61827n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i3 = 1;
                                                                                    t3bVar.f61827n = 1;
                                                                                    break;
                                                                                default:
                                                                                    uk9.m22770c();
                                                                                    return;
                                                                            }
                                                                            String strGroup9 = matcher.group(i3);
                                                                            strGroup9.getClass();
                                                                            t3bVar.f61828o = Float.parseFloat(strGroup9);
                                                                            break;
                                                                    }
                                                                    b = -1;
                                                                    switch (b) {
                                                                        case 0:
                                                                            i3 = 1;
                                                                            t3bVar.f61827n = 3;
                                                                            break;
                                                                        case 1:
                                                                            i3 = 1;
                                                                            t3bVar.f61827n = 2;
                                                                            break;
                                                                        case 2:
                                                                            i3 = 1;
                                                                            t3bVar.f61827n = 1;
                                                                            break;
                                                                        default:
                                                                            uk9.m22770c();
                                                                            return;
                                                                    }
                                                                    String strGroup10 = matcher.group(i3);
                                                                    strGroup10.getClass();
                                                                    t3bVar.f61828o = Float.parseFloat(strGroup10);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            r8 = r15;
                                            z2 = false;
                                            i6 = 1;
                                        }
                                        if ("}".equals(strM21055b2)) {
                                            arrayList3.add(t3bVar);
                                        }
                                        z2 = false;
                                        i4 = -1;
                                        str = null;
                                        i6 = 1;
                                    }
                                }
                                arrayList.addAll(arrayList3);
                            } else if (b2 == 3) {
                                Pattern pattern = z3b.f70840a;
                                Charset charset = StandardCharsets.UTF_8;
                                String strM14830n2 = k47Var.m14830n(charset);
                                if (strM14830n2 == null) {
                                    u3bVarM25429d = null;
                                } else {
                                    Pattern pattern2 = z3b.f70840a;
                                    Matcher matcher3 = pattern2.matcher(strM14830n2);
                                    if (matcher3.matches()) {
                                        u3bVarM25429d = z3b.m25429d(null, matcher3, k47Var, arrayList);
                                    } else {
                                        u3bVarM25429d = null;
                                        String strM14830n3 = k47Var.m14830n(charset);
                                        if (strM14830n3 != null) {
                                            Matcher matcher4 = pattern2.matcher(strM14830n3);
                                            if (matcher4.matches()) {
                                                u3bVarM25429d = z3b.m25429d(strM14830n2.trim(), matcher4, k47Var, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (u3bVarM25429d != null) {
                                    arrayList2.add(u3bVarM25429d);
                                }
                            }
                            p33Var = this;
                        }
                    }
                }
            }
        } catch (ParserException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // p000.st5
    /* JADX INFO: renamed from: D */
    public void mo10713D(eu5 eu5Var, Handler handler) {
        ((MediaCodec) this.f55513b).setOnFrameRenderedListener(new C0827bx(this, eu5Var, 1), handler);
    }

    @Override // p000.wc0
    /* JADX INFO: renamed from: E */
    public void mo16222E() {
        k47 k47Var = (k47) this.f55514c;
        byte[] bArr = uma.f64081b;
        k47Var.getClass();
        k47Var.m14816K(bArr.length, bArr);
    }

    @Override // p000.st5
    /* JADX INFO: renamed from: F */
    public void mo10714F(ArrayList arrayList) {
        ((MediaCodec) this.f55513b).unsubscribeFromVendorParameters(arrayList);
    }

    /* JADX INFO: renamed from: G */
    public void m18865G() {
        this.f55513b = null;
        this.f55514c = null;
    }

    /* JADX INFO: renamed from: H */
    public void m18866H() {
        C3244l c3244l = (C3244l) this.f55513b;
        bx7 bx7VarM4221a = bx7.m4221a((bx7) c3244l.getValue(), null, null, null, false, false, null, false, 16);
        c3244l.getClass();
        c3244l.m15572j(null, bx7VarM4221a);
    }

    /* JADX INFO: renamed from: I */
    public void m18867I() {
        C3244l c3244l = (C3244l) this.f55513b;
        bx7 bx7VarM4221a = bx7.m4221a((bx7) c3244l.getValue(), null, null, null, false, false, null, false, 95);
        c3244l.getClass();
        c3244l.m15572j(null, bx7VarM4221a);
    }

    /* JADX INFO: renamed from: J */
    public void m18868J(int[] iArr, int i) {
        fl3 fl3Var;
        fl3 fl3Var2;
        fl3 fl3Var3;
        el3 el3Var = (el3) this.f55513b;
        if (i == 0) {
            C3386nv.m17626m("No error correction bytes");
            return;
        }
        int length = iArr.length - i;
        if (length <= 0) {
            C3386nv.m17626m("No data bytes provided");
            return;
        }
        ArrayList arrayList = (ArrayList) this.f55514c;
        int i2 = 1;
        int i3 = 0;
        if (i >= arrayList.size()) {
            fl3 fl3Var4 = (fl3) AbstractC3393o1.m17731f(1, arrayList);
            int size = arrayList.size();
            while (size <= i) {
                int[] iArr2 = {i2, el3Var.f37424a[(size - 1) + el3Var.f37429f]};
                if (iArr2[i3] == 0) {
                    int i4 = i2;
                    while (i4 < 2 && iArr2[i4] == 0) {
                        i4++;
                    }
                    if (i4 == 2) {
                        iArr2 = new int[]{i3};
                    } else {
                        int i5 = 2 - i4;
                        int[] iArr3 = new int[i5];
                        System.arraycopy(iArr2, i4, iArr3, i3, i5);
                        iArr2 = iArr3;
                    }
                }
                el3 el3Var2 = fl3Var4.f39245a;
                if (!el3Var2.equals(el3Var)) {
                    C3386nv.m17626m("GenericGFPolys do not have same GenericGF field");
                    return;
                }
                int[] iArr4 = fl3Var4.f39246b;
                if (iArr4[i3] == 0 || iArr2[i3] == 0) {
                    fl3Var4 = el3Var2.f37426c;
                } else {
                    int length2 = iArr4.length;
                    int length3 = iArr2.length;
                    int[] iArr5 = new int[(length2 + length3) - i2];
                    int i6 = i3;
                    while (i6 < length2) {
                        int i7 = iArr4[i6];
                        while (i3 < length3) {
                            int i8 = i6 + i3;
                            iArr5[i8] = iArr5[i8] ^ el3Var2.m11215a(i7, iArr2[i3]);
                            i3++;
                            iArr4 = iArr4;
                        }
                        i6++;
                        i3 = 0;
                    }
                    fl3Var4 = new fl3(el3Var2, iArr5);
                }
                arrayList.add(fl3Var4);
                size++;
                i2 = 1;
                i3 = 0;
            }
        }
        fl3 fl3Var5 = (fl3) arrayList.get(i);
        int[] iArr6 = new int[length];
        System.arraycopy(iArr, 0, iArr6, 0, length);
        if (length == 0) {
            ij6.m13959q();
            return;
        }
        if (length > 1 && iArr6[0] == 0) {
            int i9 = 1;
            while (i9 < length && iArr6[i9] == 0) {
                i9++;
            }
            if (i9 == length) {
                iArr6 = new int[]{0};
            } else {
                int i10 = length - i9;
                int[] iArr7 = new int[i10];
                System.arraycopy(iArr6, i9, iArr7, 0, i10);
                iArr6 = iArr7;
            }
        }
        if (i < 0) {
            ij6.m13959q();
            return;
        }
        int length4 = iArr6.length;
        int[] iArr8 = new int[length4 + i];
        for (int i11 = 0; i11 < length4; i11++) {
            iArr8[i11] = el3Var.m11215a(iArr6[i11], 1);
        }
        fl3 fl3Var6 = new fl3(el3Var, iArr8);
        el3 el3Var3 = fl3Var5.f39245a;
        int[] iArr9 = fl3Var5.f39246b;
        boolean zEquals = el3Var.equals(el3Var3);
        fl3 fl3Var7 = el3Var.f37426c;
        if (!zEquals) {
            C3386nv.m17626m("GenericGFPolys do not have same GenericGF field");
            return;
        }
        if (iArr9[0] == 0) {
            C3386nv.m17626m("Divide by 0");
            return;
        }
        int i12 = iArr9[(iArr9.length - 1) - fl3Var5.m11933b()];
        if (i12 == 0) {
            throw new ArithmeticException();
        }
        int i13 = el3Var.f37424a[(el3Var.f37427d - el3Var.f37425b[i12]) - 1];
        fl3 fl3VarM11932a = fl3Var7;
        while (true) {
            int[] iArr10 = fl3Var6.f39246b;
            if (fl3Var6.m11933b() < fl3Var5.m11933b() || iArr10[0] == 0) {
                break;
            }
            int iM11933b = fl3Var6.m11933b() - fl3Var5.m11933b();
            int iM11215a = el3Var.m11215a(iArr10[(iArr10.length - 1) - fl3Var6.m11933b()], i13);
            el3 el3Var4 = fl3Var5.f39245a;
            if (iM11933b < 0) {
                ij6.m13959q();
                return;
            }
            if (iM11215a == 0) {
                fl3Var2 = el3Var4.f37426c;
                fl3Var = fl3Var5;
            } else {
                int length5 = iArr9.length;
                int[] iArr11 = new int[length5 + iM11933b];
                int i14 = 0;
                while (i14 < length5) {
                    iArr11[i14] = el3Var4.m11215a(iArr9[i14], iM11215a);
                    i14++;
                    fl3Var5 = fl3Var5;
                }
                fl3Var = fl3Var5;
                fl3Var2 = new fl3(el3Var4, iArr11);
            }
            if (iM11933b < 0) {
                ij6.m13959q();
                return;
            }
            if (iM11215a == 0) {
                fl3Var3 = fl3Var7;
            } else {
                int[] iArr12 = new int[iM11933b + 1];
                iArr12[0] = iM11215a;
                fl3Var3 = new fl3(el3Var, iArr12);
            }
            fl3VarM11932a = fl3VarM11932a.m11932a(fl3Var3);
            fl3Var6 = fl3Var6.m11932a(fl3Var2);
            fl3Var5 = fl3Var;
        }
        int[] iArr13 = new fl3[]{fl3VarM11932a, fl3Var6}[1].f39246b;
        int length6 = i - iArr13.length;
        for (int i15 = 0; i15 < length6; i15++) {
            iArr[length + i15] = 0;
        }
        System.arraycopy(iArr13, 0, iArr, length + length6, iArr13.length);
    }

    /* JADX INFO: renamed from: K */
    public void m18869K(Uri uri) {
        ck6 ck6Var;
        C1210f c1210f = (C1210f) this.f55514c;
        C1212h c1212h = (C1212h) this.f55513b;
        Context context = c1210f.f14015b;
        eh0.m11114K();
        if (uri != null && !uri.toString().isEmpty()) {
            String string = uri.toString();
            if (string.startsWith("action://")) {
                ck6 ck6VarM4787g = ck6.m4787g(string.replace("action://", ""));
                IterableActionSource iterableActionSource = IterableActionSource.PUSH;
                kgd.m15193a(context, ck6VarM4787g);
            } else if (string.startsWith("itbl://")) {
                ck6 ck6VarM4787g2 = ck6.m4787g(string.replace("itbl://", ""));
                IterableActionSource iterableActionSource2 = IterableActionSource.PUSH;
                kgd.m15193a(context, ck6VarM4787g2);
            } else if (!string.startsWith("iterable://")) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("type", "openUrl");
                    jSONObject.put("data", string);
                    ck6Var = new ck6(jSONObject);
                } catch (JSONException unused) {
                    ck6Var = null;
                }
                IterableActionSource iterableActionSource3 = IterableActionSource.PUSH;
                kgd.m15193a(context, ck6Var);
            } else if ("delete".equals(string.replace("iterable://", ""))) {
                c1210f.m6915g(c1212h, IterableInAppDeleteActionType.DELETE_BUTTON, IterableInAppLocation.IN_APP);
            }
        }
        c1210f.f14023j = System.currentTimeMillis();
        c1210f.m6916h();
    }

    /* JADX INFO: renamed from: M */
    public Object mo14164M(vl5 vl5Var) {
        return (m79) this.f55514c;
    }

    /* JADX INFO: renamed from: N */
    public Object m18870N(float f, float f2, Object obj, Object obj2, float f3, float f4, float f5) {
        vl5 vl5Var = (vl5) this.f55513b;
        vl5Var.f65562a = f;
        vl5Var.f65563b = f2;
        vl5Var.f65564c = obj;
        vl5Var.f65565d = obj2;
        vl5Var.f65566e = f3;
        vl5Var.f65567f = f4;
        vl5Var.f65568g = f5;
        return mo14164M(vl5Var);
    }

    /* JADX INFO: renamed from: O */
    public void m18871O() {
        ((SparseIntArray) this.f55513b).clear();
    }

    /* JADX INFO: renamed from: P */
    public c83 m18872P(int i, int i2, int i3, String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return AbstractC3224d.m15536o(((C1306v) ((w3a) this.f55514c)).m7382h(i, i2, i3, str, str2, bq1.m4062m0(str3, str)));
    }

    /* JADX INFO: renamed from: Q */
    public Object m18873Q(String str, LanguageProgressInterval languageProgressInterval, LanguageProgressMetric languageProgressMetric, double d, SuspendLambda suspendLambda) {
        String value;
        String key;
        hm5 hm5Var = (hm5) this.f55514c;
        Bundle bundle = new Bundle();
        int[] iArr = jha.f45553a;
        int i = iArr[languageProgressMetric.ordinal()];
        if (i == 1) {
            value = LqAnalyticsValues$AdjustedStat.Listening.getValue();
        } else if (i == 2) {
            value = LqAnalyticsValues$AdjustedStat.Reading.getValue();
        } else if (i != 3) {
            value = i != 4 ? LqAnalyticsValues$AdjustedStat.Listening.getValue() : LqAnalyticsValues$AdjustedStat.Speaking.getValue();
        } else {
            value = LqAnalyticsValues$AdjustedStat.Writing.getValue();
        }
        bundle.putString("adjusted stat", value);
        bundle.putString("adjustment location", LqAnalyticsValues$AdjustedStatLocation.StatsPage.getValue());
        bundle.putString("increase or decrease", d > 0.0d ? LqAnalyticsValues$AdjustedStatAction.Increase.getValue() : LqAnalyticsValues$AdjustedStatAction.Decrease.getValue());
        ((C1240a) hm5Var).m7025f("Stat adjusted", bundle);
        oo4 oo4Var = (oo4) this.f55513b;
        int i2 = iArr[languageProgressMetric.ordinal()];
        if (i2 == 1) {
            key = LanguageProgressUpdate.HoursListening.getKey();
        } else if (i2 == 2) {
            key = LanguageProgressUpdate.WordsReading.getKey();
        } else if (i2 != 3) {
            key = i2 != 4 ? LanguageProgressUpdate.HoursListening.getKey() : LanguageProgressUpdate.HoursSpeaking.getKey();
        } else {
            key = LanguageProgressUpdate.WordsWriting.getKey();
        }
        Object objM7239m = ((C1294j) oo4Var).m7239m(str, languageProgressInterval, key, d, suspendLambda);
        return objM7239m == CoroutineSingletons.COROUTINE_SUSPENDED ? objM7239m : xfa.f68157a;
    }

    /* JADX INFO: renamed from: R */
    public void m18874R() throws IOException {
        String str = (String) this.f55513b;
        if (((FileChannel) this.f55514c) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.f55514c = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.f55514c;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.f55514c = null;
            throw new IllegalStateException(wq1.m24118n("Unable to lock file: '", str, "'."), th);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m18875T() {
        C3244l c3244l = (C3244l) this.f55513b;
        bx7 bx7VarM4221a = bx7.m4221a((bx7) c3244l.getValue(), null, null, null, false, true, null, false, 111);
        c3244l.getClass();
        c3244l.m15572j(null, bx7VarM4221a);
    }

    /* JADX INFO: renamed from: U */
    public void m18876U(d87 d87Var, boolean z) {
        C3244l c3244l = (C3244l) this.f55513b;
        bx7 bx7VarM4221a = bx7.m4221a((bx7) c3244l.getValue(), null, null, d87Var, d87Var != null && z, false, null, false, 115);
        c3244l.getClass();
        c3244l.m15572j(null, bx7VarM4221a);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    /* JADX INFO: renamed from: V */
    public void m18877V(iy7 iy7Var) {
        boolean z;
        C3244l c3244l = (C3244l) this.f55513b;
        bx7 bx7Var = (bx7) c3244l.getValue();
        d87 d87Var = bx7Var.f9139c;
        if (d87Var != null) {
            xz7 xz7Var = iy7Var.f44779a;
            if (xz7Var.f69004a == d87Var.f35173b && xz7Var.f69005b == d87Var.f35174c) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (!z) {
            d87Var = null;
        }
        bx7 bx7VarM4221a = bx7.m4221a(bx7Var, null, iy7Var, d87Var, z && bx7Var.f9140d, false, null, false, 112);
        c3244l.getClass();
        c3244l.m15572j(null, bx7VarM4221a);
    }

    /* JADX INFO: renamed from: W */
    public void m18878W(xz7 xz7Var, boolean z) {
        C3244l c3244l = (C3244l) this.f55513b;
        bx7 bx7Var = (bx7) c3244l.getValue();
        d87 d87Var = bx7Var.f9139c;
        boolean z2 = xz7Var != null && d87Var != null && xz7Var.f69004a >= d87Var.f35173b && xz7Var.f69005b <= d87Var.f35174c;
        iy7 iy7Var = z ? bx7Var.f9138b : null;
        if (!z2) {
            d87Var = null;
        }
        bx7 bx7VarM4221a = bx7.m4221a(bx7Var, xz7Var, iy7Var, d87Var, z2 && bx7Var.f9140d, false, null, false, 112);
        c3244l.getClass();
        c3244l.m15572j(null, bx7VarM4221a);
    }

    /* JADX INFO: renamed from: X */
    public void m18879X(boolean z) {
        C3244l c3244l = (C3244l) this.f55513b;
        bx7 bx7VarM4221a = bx7.m4221a((bx7) c3244l.getValue(), null, null, null, false, false, null, z, 63);
        c3244l.getClass();
        c3244l.m15572j(null, bx7VarM4221a);
    }

    @Override // p000.st5
    /* JADX INFO: renamed from: a */
    public void mo10715a() {
        C3309ls c3309ls = (C3309ls) this.f55514c;
        MediaCodec mediaCodec = (MediaCodec) this.f55513b;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
        } finally {
            if (Build.VERSION.SDK_INT >= 35 && c3309ls != null) {
                c3309ls.m16489I(mediaCodec);
            }
            mediaCodec.release();
        }
    }

    @Override // p000.nt8
    /* JADX INFO: renamed from: b */
    public void mo11950b(k47 k47Var) {
        kca kcaVar = (kca) this.f55514c;
        SparseArray sparseArray = kcaVar.f47040g;
        so0 so0Var = (so0) this.f55513b;
        if (k47Var.m14842z() == 0 && (k47Var.m14842z() & 128) != 0) {
            k47Var.m14819N(6);
            int iM14820a = k47Var.m14820a() / 4;
            for (int i = 0; i < iM14820a; i++) {
                k47Var.m14827k(so0Var.f61083b, 0, 4);
                so0Var.m21509m(0);
                int iM21503g = so0Var.m21503g(16);
                so0Var.m21511o(3);
                if (iM21503g == 0) {
                    so0Var.m21511o(13);
                } else {
                    int iM21503g2 = so0Var.m21503g(13);
                    if (sparseArray.get(iM21503g2) == null) {
                        sparseArray.put(iM21503g2, new ot8(new fn3(kcaVar, iM21503g2)));
                        kcaVar.f47046m++;
                    }
                }
            }
            sparseArray.remove(0);
        }
    }

    @Override // p000.nt8
    /* JADX INFO: renamed from: c */
    public void mo11951c(g1a g1aVar, jy2 jy2Var, mca mcaVar) {
    }

    @Override // p000.st5
    /* JADX INFO: renamed from: d */
    public void mo10717d(Bundle bundle) {
        ((MediaCodec) this.f55513b).setParameters(bundle);
    }

    @Override // p000.st5
    /* JADX INFO: renamed from: e */
    public void mo10718e(int i, xr1 xr1Var, long j, int i2) {
        ((MediaCodec) this.f55513b).queueSecureInputBuffer(i, 0, xr1Var.f68568i, j, i2);
    }

    @Override // p000.st5
    /* JADX INFO: renamed from: f */
    public void mo10719f(int i, int i2, int i3, long j) {
        ((MediaCodec) this.f55513b).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // p000.st5
    public void flush() {
        ((MediaCodec) this.f55513b).flush();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00e4  */
    @Override // p000.wc0
    /* JADX INFO: renamed from: g */
    public vc0 mo14881g(iy2 iy2Var, long j) {
        int iM15824a;
        long position = iy2Var.getPosition();
        int iMin = (int) Math.min(20000L, iy2Var.getLength() - position);
        k47 k47Var = (k47) this.f55514c;
        k47Var.m14815J(iMin);
        iy2Var.mo13085o(k47Var.f46700a, 0, iMin);
        int i = -1;
        int i2 = -1;
        long j2 = -9223372036854775807L;
        while (k47Var.m14820a() >= 4) {
            if (l63.m15824a(k47Var.f46701b, k47Var.f46700a) != 442) {
                k47Var.m14819N(1);
            } else {
                k47Var.m14819N(4);
                long jM24627c = xo7.m24627c(k47Var);
                if (jM24627c != -9223372036854775807L) {
                    long jM12280b = ((g1a) this.f55513b).m12280b(jM24627c);
                    if (jM12280b > j) {
                        return j2 == -9223372036854775807L ? new vc0(-1, jM12280b, position) : new vc0(0, -9223372036854775807L, position + ((long) i2));
                    }
                    j2 = jM12280b;
                    long j3 = 100000 + j2;
                    i2 = k47Var.f46701b;
                    if (j3 > j) {
                        return new vc0(0, -9223372036854775807L, position + ((long) i2));
                    }
                }
                int i3 = k47Var.f46702c;
                if (k47Var.m14820a() >= 10) {
                    k47Var.m14819N(9);
                    int iM14842z = k47Var.m14842z() & 7;
                    if (k47Var.m14820a() >= iM14842z) {
                        k47Var.m14819N(iM14842z);
                        if (k47Var.m14820a() >= 4) {
                            if (l63.m15824a(k47Var.f46701b, k47Var.f46700a) != 443) {
                                while (k47Var.m14820a() >= 4) {
                                    iM15824a = l63.m15824a(k47Var.f46701b, k47Var.f46700a);
                                    if (iM15824a == 442) {
                                        break;
                                    }
                                    break;
                                }
                            }
                            k47Var.m14819N(4);
                            int iM14812G = k47Var.m14812G();
                            if (k47Var.m14820a() < iM14812G) {
                                k47Var.m14818M(i3);
                            } else {
                                k47Var.m14819N(iM14812G);
                                while (k47Var.m14820a() >= 4) {
                                    iM15824a = l63.m15824a(k47Var.f46701b, k47Var.f46700a);
                                    if (iM15824a == 442 || iM15824a == 441 || (iM15824a >>> 8) != 1) {
                                        break;
                                    }
                                    k47Var.m14819N(4);
                                    if (k47Var.m14820a() < 2) {
                                        k47Var.m14818M(i3);
                                        break;
                                    }
                                    k47Var.m14818M(Math.min(k47Var.f46702c, k47Var.f46701b + k47Var.m14812G()));
                                }
                            }
                        } else {
                            k47Var.m14818M(i3);
                        }
                    } else {
                        k47Var.m14818M(i3);
                    }
                } else {
                    k47Var.m14818M(i3);
                }
                i = k47Var.f46701b;
            }
        }
        return j2 != -9223372036854775807L ? new vc0(-2, j2, position + ((long) i)) : vc0.f65176d;
    }

    @Override // p000.st5
    /* JADX INFO: renamed from: h */
    public void mo10720h(int i) {
        ((MediaCodec) this.f55513b).releaseOutputBuffer(i, false);
    }

    @Override // p000.st5
    /* JADX INFO: renamed from: j */
    public MediaFormat mo10722j() {
        return ((MediaCodec) this.f55513b).getOutputFormat();
    }

    @Override // p000.st5
    /* JADX INFO: renamed from: l */
    public void mo10724l() {
        ((MediaCodec) this.f55513b).detachOutputSurface();
    }

    @Override // p000.my2
    /* JADX INFO: renamed from: n */
    public void mo9121n(zj5 zj5Var) {
        ((vi3) this.f55513b).invoke(zj5Var.f71649a.f11311e);
    }

    @Override // p000.st5
    /* JADX INFO: renamed from: o */
    public void mo10727o(int i, long j) {
        ((MediaCodec) this.f55513b).releaseOutputBuffer(i, j);
    }

    @Override // p000.lr9
    /* JADX INFO: renamed from: p */
    public void mo11812p(Drawable drawable) {
        ImageView imageView = (ImageView) this.f55514c;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        Bitmap bitmap = bitmapDrawable != null ? bitmapDrawable.getBitmap() : null;
        if (bitmap == null) {
            imageView.setImageDrawable(drawable);
            return;
        }
        pi8 pi8Var = new pi8(imageView.getResources(), bitmap);
        pi8Var.m19179a(false);
        imageView.setImageDrawable(pi8Var);
    }

    @Override // p000.st5
    /* JADX INFO: renamed from: q */
    public int mo10728q() {
        return ((MediaCodec) this.f55513b).dequeueInputBuffer(0L);
    }

    @Override // p000.my2
    /* JADX INFO: renamed from: r */
    public void mo9122r(FacebookException facebookException) {
        vi3 vi3Var = (vi3) this.f55514c;
        String message = facebookException.getMessage();
        if (message == null) {
            message = "Unknown error";
        }
        vi3Var.invoke("Facebook sign-in failed: ".concat(message));
    }

    @Override // p000.lr9
    /* JADX INFO: renamed from: s */
    public void mo11813s(Drawable drawable) {
    }

    @Override // p000.st5
    /* JADX INFO: renamed from: t */
    public int mo10729t(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = ((MediaCodec) this.f55513b).dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    public String toString() {
        switch (this.f55512a) {
            case 29:
                return "Bounds{lower=" + ((l64) this.f55513b) + " upper=" + ((l64) this.f55514c) + "}";
            default:
                return super.toString();
        }
    }

    @Override // p000.lr9
    /* JADX INFO: renamed from: u */
    public void mo11814u(Drawable drawable) {
        ((ImageView) this.f55513b).setImageBitmap(null);
    }

    @Override // p000.st5
    /* JADX INFO: renamed from: v */
    public void mo10730v(int i) {
        ((MediaCodec) this.f55513b).setVideoScalingMode(i);
    }

    @Override // p000.st5
    /* JADX INFO: renamed from: w */
    public ByteBuffer mo10731w(int i) {
        return ((MediaCodec) this.f55513b).getInputBuffer(i);
    }

    @Override // p000.ao9
    /* JADX INFO: renamed from: x */
    public String mo2959x() {
        switch (this.f55512a) {
            case 18:
                break;
        }
        return (String) this.f55513b;
    }

    @Override // p000.st5
    /* JADX INFO: renamed from: y */
    public void mo10732y(Surface surface) {
        ((MediaCodec) this.f55513b).setOutputSurface(surface);
    }

    @Override // p000.ao9
    /* JADX INFO: renamed from: z */
    public void mo2960z(zn9 zn9Var) {
        j3d.m14283a(zn9Var, (Object[]) this.f55514c);
    }

    public /* synthetic */ p33(int i, boolean z) {
        this.f55512a = i;
    }

    public /* synthetic */ p33(Object obj, Object obj2, boolean z, int i) {
        this.f55512a = i;
        this.f55514c = obj;
        this.f55513b = obj2;
    }

    public p33(oo4 oo4Var, hm5 hm5Var) {
        this.f55512a = 27;
        oo4Var.getClass();
        hm5Var.getClass();
        this.f55513b = oo4Var;
        this.f55514c = hm5Var;
    }

    public p33(d65 d65Var, w3a w3aVar) {
        this.f55512a = 3;
        d65Var.getClass();
        w3aVar.getClass();
        this.f55513b = d65Var;
        this.f55514c = w3aVar;
    }

    public p33(ig8 ig8Var, C1307w c1307w) {
        this.f55512a = 17;
        ig8Var.getClass();
        c1307w.getClass();
        this.f55513b = ig8Var;
        this.f55514c = c1307w;
    }

    public p33(si7 si7Var, nm7 nm7Var) {
        this.f55512a = 19;
        si7Var.getClass();
        nm7Var.getClass();
        this.f55513b = si7Var;
        this.f55514c = nm7Var;
    }

    public /* synthetic */ p33(int i, Object obj, Object obj2) {
        this.f55512a = i;
        this.f55513b = obj;
        this.f55514c = obj2;
    }

    public p33(String str, cg7 cg7Var) {
        this.f55512a = 18;
        this.f55513b = str;
        this.f55514c = new cg7(cg7Var, 13);
    }

    public p33(un1 un1Var) {
        this.f55512a = 14;
        un1Var.getClass();
        C3244l c3244lM17114d = AbstractC3352my.m17114d(new bx7());
        this.f55513b = c3244lM17114d;
        this.f55514c = AbstractC3224d.m15520B(c3244lM17114d, un1Var, xi9.f68262a, new bx7());
    }

    public p33(el3 el3Var) {
        this.f55512a = 15;
        this.f55513b = el3Var;
        ArrayList arrayList = new ArrayList();
        this.f55514c = arrayList;
        arrayList.add(new fl3(el3Var, new int[]{1}));
    }

    public p33(String str, int i) {
        this.f55512a = i;
        switch (i) {
            case 20:
                this.f55513b = str;
                this.f55514c = null;
                break;
            default:
                this.f55513b = str.concat(".lck");
                break;
        }
    }

    public p33(m79 m79Var) {
        this.f55512a = 9;
        this.f55513b = new vl5();
        this.f55514c = m79Var;
    }

    public p33(g1a g1aVar) {
        this.f55512a = 13;
        this.f55513b = g1aVar;
        this.f55514c = new k47();
    }

    public p33(MediaCodec mediaCodec, C3309ls c3309ls) {
        this.f55512a = 23;
        this.f55513b = mediaCodec;
        this.f55514c = c3309ls;
        if (Build.VERSION.SDK_INT < 35 || c3309ls == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) c3309ls.f50066d;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            bna.m3987z(((HashSet) c3309ls.f50065c).add(mediaCodec));
        }
    }

    public p33(ArrayList arrayList, ArrayList arrayList2) {
        this.f55512a = 4;
        int size = arrayList.size();
        this.f55513b = new int[size];
        this.f55514c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f55513b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f55514c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public p33(WindowInsetsAnimation.Bounds bounds) {
        this.f55512a = 29;
        this.f55513b = l64.m15831d(bounds.getLowerBound());
        this.f55514c = l64.m15831d(bounds.getUpperBound());
    }

    public p33(int i, int i2) {
        this.f55512a = 4;
        this.f55513b = new int[]{i, i2};
        this.f55514c = new float[]{0.0f, 1.0f};
    }

    public p33(int i, int i2, int i3) {
        this.f55512a = 4;
        this.f55513b = new int[]{i, i2, i3};
        this.f55514c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public p33(kca kcaVar) {
        this.f55512a = 25;
        this.f55514c = kcaVar;
        this.f55513b = new so0(4, new byte[4]);
    }

    public p33(int i) {
        this.f55512a = i;
        switch (i) {
            case 9:
                this.f55513b = new vl5();
                this.f55514c = null;
                break;
            case 28:
                this.f55513b = new k47();
                this.f55514c = new s3b();
                break;
            default:
                this.f55513b = new SparseIntArray();
                this.f55514c = new SparseIntArray();
                break;
        }
    }
}
