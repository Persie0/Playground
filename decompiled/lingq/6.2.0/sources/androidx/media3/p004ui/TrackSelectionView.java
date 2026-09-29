package androidx.media3.p004ui;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import androidx.media3.common.C0713b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p000.ViewOnClickListenerC3135j5;
import p000.ck6;
import p000.ez5;
import p000.j8a;
import p000.l8a;
import p000.p8a;
import p000.t8a;
import p000.z8a;

/* JADX INFO: loaded from: classes2.dex */
public class TrackSelectionView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final int f6528a;

    /* JADX INFO: renamed from: b */
    public final LayoutInflater f6529b;

    /* JADX INFO: renamed from: c */
    public final CheckedTextView f6530c;

    /* JADX INFO: renamed from: d */
    public final CheckedTextView f6531d;

    /* JADX INFO: renamed from: e */
    public final ViewOnClickListenerC3135j5 f6532e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f6533f;

    /* JADX INFO: renamed from: g */
    public final HashMap f6534g;

    /* JADX INFO: renamed from: h */
    public boolean f6535h;

    /* JADX INFO: renamed from: i */
    public boolean f6536i;

    /* JADX INFO: renamed from: j */
    public l8a f6537j;

    /* JADX INFO: renamed from: k */
    public CheckedTextView[][] f6538k;

    /* JADX INFO: renamed from: l */
    public boolean f6539l;

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f6528a = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f6529b = layoutInflaterFrom;
        ViewOnClickListenerC3135j5 viewOnClickListenerC3135j5 = new ViewOnClickListenerC3135j5(this, 7);
        this.f6532e = viewOnClickListenerC3135j5;
        this.f6537j = new ck6(getResources());
        this.f6533f = new ArrayList();
        this.f6534g = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f6530c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(R$string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(viewOnClickListenerC3135j5);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(R$layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f6531d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(R$string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(viewOnClickListenerC3135j5);
        addView(checkedTextView2);
    }

    /* JADX INFO: renamed from: a */
    public final void m2571a() {
        this.f6530c.setChecked(this.f6539l);
        boolean z = this.f6539l;
        HashMap map = this.f6534g;
        this.f6531d.setChecked(!z && map.isEmpty());
        for (int i = 0; i < this.f6538k.length; i++) {
            p8a p8aVar = (p8a) map.get(((z8a) this.f6533f.get(i)).f71097b);
            int i2 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f6538k[i];
                if (i2 < checkedTextViewArr.length) {
                    if (p8aVar != null) {
                        Object tag = checkedTextViewArr[i2].getTag();
                        tag.getClass();
                        this.f6538k[i][i2].setChecked(p8aVar.f55769b.contains(Integer.valueOf(((t8a) tag).f61991b)));
                    } else {
                        checkedTextViewArr[i2].setChecked(false);
                    }
                    i2++;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [int] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r27v0, types: [android.view.ViewGroup, androidx.media3.ui.TrackSelectionView] */
    /* JADX INFO: renamed from: b */
    public final void m2572b() {
        String strM11393c;
        int i;
        String strM4803i;
        String string;
        boolean z;
        boolean z2 = true;
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        ArrayList arrayList = this.f6533f;
        boolean zIsEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.f6531d;
        boolean z3 = false;
        CheckedTextView checkedTextView2 = this.f6530c;
        if (zIsEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.f6538k = new CheckedTextView[arrayList.size()][];
        boolean z4 = this.f6536i && arrayList.size() > 1;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            z8a z8aVar = (z8a) arrayList.get(i2);
            boolean z5 = (this.f6535h && z8aVar.f71098c) ? z2 : z3;
            CheckedTextView[][] checkedTextViewArr = this.f6538k;
            int i3 = z8aVar.f71096a;
            checkedTextViewArr[i2] = new CheckedTextView[i3];
            t8a[] t8aVarArr = new t8a[i3];
            for (?? r10 = z3; r10 < z8aVar.f71096a; r10++) {
                t8aVarArr[r10] = new t8a(z8aVar, r10);
            }
            for (?? r11 = z3; r11 < i3; r11++) {
                LayoutInflater layoutInflater = this.f6529b;
                if (r11 == 0) {
                    addView(layoutInflater.inflate(R$layout.exo_list_divider, (ViewGroup) this, z3));
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate((z5 || z4) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, z3);
                checkedTextView3.setBackgroundResource(this.f6528a);
                l8a l8aVar = this.f6537j;
                t8a t8aVar = t8aVarArr[r11];
                C0713b c0713bM25492b = t8aVar.f61990a.m25492b(t8aVar.f61991b);
                ck6 ck6Var = (ck6) l8aVar;
                Resources resources = (Resources) ck6Var.f10194b;
                Resources resources2 = (Resources) ck6Var.f10194b;
                String str = c0713bM25492b.f6406o;
                int i4 = c0713bM25492b.f6401j;
                ArrayList arrayList2 = arrayList;
                int i5 = c0713bM25492b.f6381G;
                int i6 = c0713bM25492b.f6414w;
                boolean z6 = z4;
                int i7 = c0713bM25492b.f6413v;
                int i8 = i2;
                String str2 = c0713bM25492b.f6402k;
                int iM11397g = ez5.m11397g(str);
                boolean z7 = z5;
                t8a[] t8aVarArr2 = t8aVarArr;
                if (iM11397g != -1) {
                    i = -1;
                } else {
                    String str3 = null;
                    if (str2 == null) {
                        strM11393c = null;
                        break;
                    }
                    String[] strArrSplit = TextUtils.isEmpty(str2) ? new String[0] : str2.trim().split("(\\s*,\\s*)", -1);
                    int length = strArrSplit.length;
                    String[] strArr = strArrSplit;
                    int i9 = 0;
                    while (true) {
                        if (i9 >= length) {
                            strM11393c = null;
                            break;
                        }
                        strM11393c = ez5.m11393c(strArr[i9]);
                        if (strM11393c != null && ez5.m11401k(strM11393c)) {
                            break;
                        } else {
                            i9++;
                        }
                    }
                    if (strM11393c != null) {
                        iM11397g = 2;
                    } else {
                        if (str2 != null) {
                            for (String str4 : TextUtils.isEmpty(str2) ? new String[0] : str2.trim().split("(\\s*,\\s*)", -1)) {
                                String strM11393c2 = ez5.m11393c(str4);
                                if (strM11393c2 != null && ez5.m11398h(strM11393c2)) {
                                    str3 = strM11393c2;
                                    break;
                                }
                            }
                        }
                        if (str3 != null) {
                            iM11397g = 1;
                        } else {
                            i = -1;
                            iM11397g = (i7 == -1 && i6 == -1) ? (i5 == -1 && c0713bM25492b.f6382H == -1) ? -1 : 1 : 2;
                        }
                    }
                    i = -1;
                }
                if (iM11397g == 2) {
                    strM4803i = ck6Var.m4809r(ck6Var.m4804j(c0713bM25492b), (i7 == i || i6 == i) ? "" : resources.getString(R$string.exo_track_resolution, Integer.valueOf(i7), Integer.valueOf(i6)), i4 != i ? resources2.getString(R$string.exo_track_bitrate, Float.valueOf(i4 / 1000000.0f)) : "");
                } else if (iM11397g == 1) {
                    String strM4803i2 = ck6Var.m4803i(c0713bM25492b);
                    if (i5 == -1 || i5 < 1) {
                        string = "";
                    } else if (i5 == 1) {
                        string = resources.getString(R$string.exo_track_mono);
                    } else if (i5 == 2) {
                        string = resources.getString(R$string.exo_track_stereo);
                    } else if (i5 == 6 || i5 == 7) {
                        string = resources.getString(R$string.exo_track_surround_5_point_1);
                    } else {
                        string = i5 != 8 ? resources.getString(R$string.exo_track_surround) : resources.getString(R$string.exo_track_surround_7_point_1);
                    }
                    strM4803i = ck6Var.m4809r(strM4803i2, string, i4 != -1 ? resources2.getString(R$string.exo_track_bitrate, Float.valueOf(i4 / 1000000.0f)) : "");
                } else {
                    strM4803i = ck6Var.m4803i(c0713bM25492b);
                }
                if (strM4803i.isEmpty()) {
                    String str5 = c0713bM25492b.f6395d;
                    strM4803i = (str5 == null || str5.trim().isEmpty()) ? resources.getString(R$string.exo_track_unknown) : resources.getString(R$string.exo_track_unknown_name, str5);
                }
                checkedTextView3.setText(strM4803i);
                checkedTextView3.setTag(t8aVarArr2[r11]);
                if (z8aVar.f71099d[r11] != 4) {
                    z = false;
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                    z2 = true;
                } else {
                    z2 = true;
                    z = false;
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.f6532e);
                }
                this.f6538k[i8][r11] = checkedTextView3;
                addView(checkedTextView3);
                z3 = z;
                arrayList = arrayList2;
                z5 = z7;
                z4 = z6;
                i2 = i8;
                t8aVarArr = t8aVarArr2;
            }
            i2++;
        }
        m2571a();
    }

    public boolean getIsDisabled() {
        return this.f6539l;
    }

    public Map<j8a, p8a> getOverrides() {
        return this.f6534g;
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.f6535h != z) {
            this.f6535h = z;
            m2572b();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.f6536i != z) {
            this.f6536i = z;
            if (!z) {
                HashMap map = this.f6534g;
                if (map.size() > 1) {
                    HashMap map2 = new HashMap();
                    int i = 0;
                    while (true) {
                        ArrayList arrayList = this.f6533f;
                        if (i >= arrayList.size()) {
                            break;
                        }
                        p8a p8aVar = (p8a) map.get(((z8a) arrayList.get(i)).f71097b);
                        if (p8aVar != null && map2.isEmpty()) {
                            map2.put(p8aVar.f55768a, p8aVar);
                        }
                        i++;
                    }
                    map.clear();
                    map.putAll(map2);
                }
            }
            m2572b();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.f6530c.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(l8a l8aVar) {
        l8aVar.getClass();
        this.f6537j = l8aVar;
        m2572b();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context) {
        this(context, null);
    }
}
