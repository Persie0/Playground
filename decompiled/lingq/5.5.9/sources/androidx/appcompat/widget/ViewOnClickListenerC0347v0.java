package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.C0141b;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.kochava.tracker.BuildConfig;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import p039c3.AbstractC1675c;
import p254m2.C7472a;

/* JADX INFO: renamed from: androidx.appcompat.widget.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0347v0 extends AbstractC1675c implements View.OnClickListener {

    /* JADX INFO: renamed from: S */
    public static final /* synthetic */ int f1345S = 0;

    /* JADX INFO: renamed from: H */
    public final Context f1346H;

    /* JADX INFO: renamed from: I */
    public final WeakHashMap<String, Drawable.ConstantState> f1347I;

    /* JADX INFO: renamed from: J */
    public final int f1348J;

    /* JADX INFO: renamed from: K */
    public int f1349K;

    /* JADX INFO: renamed from: L */
    public ColorStateList f1350L;

    /* JADX INFO: renamed from: M */
    public int f1351M;

    /* JADX INFO: renamed from: N */
    public int f1352N;

    /* JADX INFO: renamed from: O */
    public int f1353O;

    /* JADX INFO: renamed from: P */
    public int f1354P;

    /* JADX INFO: renamed from: Q */
    public int f1355Q;

    /* JADX INFO: renamed from: R */
    public int f1356R;

    /* JADX INFO: renamed from: k */
    public final SearchView f1357k;

    /* JADX INFO: renamed from: l */
    public final SearchableInfo f1358l;

    /* JADX INFO: renamed from: androidx.appcompat.widget.v0$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final TextView f1359a;

        /* JADX INFO: renamed from: b */
        public final TextView f1360b;

        /* JADX INFO: renamed from: c */
        public final ImageView f1361c;

        /* JADX INFO: renamed from: d */
        public final ImageView f1362d;

        /* JADX INFO: renamed from: e */
        public final ImageView f1363e;

        public a(View view) {
            this.f1359a = (TextView) view.findViewById(R.id.text1);
            this.f1360b = (TextView) view.findViewById(R.id.text2);
            this.f1361c = (ImageView) view.findViewById(R.id.icon1);
            this.f1362d = (ImageView) view.findViewById(R.id.icon2);
            this.f1363e = (ImageView) view.findViewById(com.linguist.R.id.edit_query);
        }
    }

    public ViewOnClickListenerC0347v0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout());
        this.f1349K = 1;
        this.f1351M = -1;
        this.f1352N = -1;
        this.f1353O = -1;
        this.f1354P = -1;
        this.f1355Q = -1;
        this.f1356R = -1;
        this.f1357k = searchView;
        this.f1358l = searchableInfo;
        this.f1348J = searchView.getSuggestionCommitIconResId();
        this.f1346H = context;
        this.f1347I = weakHashMap;
    }

    /* JADX INFO: renamed from: i */
    public static String m1270i(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    @Override // p039c3.AbstractC1673a
    /* JADX INFO: renamed from: b */
    public final void mo1271b(View view, Cursor cursor) throws FileNotFoundException {
        int i10;
        Drawable drawableM1276g;
        Drawable drawable;
        CharSequence charSequenceM1270i;
        a aVar = (a) view.getTag();
        int i11 = this.f1356R;
        int i12 = i11 != -1 ? cursor.getInt(i11) : 0;
        TextView textView = aVar.f1359a;
        if (textView != null) {
            String strM1270i = m1270i(cursor, this.f1351M);
            textView.setText(strM1270i);
            if (TextUtils.isEmpty(strM1270i)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        Context context = this.f1346H;
        TextView textView2 = aVar.f1360b;
        if (textView2 != null) {
            String strM1270i2 = m1270i(cursor, this.f1353O);
            if (strM1270i2 != null) {
                if (this.f1350L == null) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(com.linguist.R.attr.textColorSearchUrl, typedValue, true);
                    this.f1350L = context.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(strM1270i2);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f1350L, null), 0, strM1270i2.length(), 33);
                charSequenceM1270i = spannableString;
            } else {
                charSequenceM1270i = m1270i(cursor, this.f1352N);
            }
            if (TextUtils.isEmpty(charSequenceM1270i)) {
                if (textView != null) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(2);
                }
            } else if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
            }
            textView2.setText(charSequenceM1270i);
            if (TextUtils.isEmpty(charSequenceM1270i)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
        }
        ImageView imageView = aVar.f1361c;
        if (imageView != null) {
            int i13 = this.f1354P;
            if (i13 == -1) {
                drawableM1276g = null;
            } else {
                drawableM1276g = m1276g(cursor.getString(i13));
                if (drawableM1276g == null) {
                    ComponentName searchActivity = this.f1358l.getSearchActivity();
                    String strFlattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap<String, Drawable.ConstantState> weakHashMap = this.f1347I;
                    if (weakHashMap.containsKey(strFlattenToShortString)) {
                        Drawable.ConstantState constantState = weakHashMap.get(strFlattenToShortString);
                        drawableM1276g = constantState == null ? null : constantState.newDrawable(context.getResources());
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            ActivityInfo activityInfo = packageManager.getActivityInfo(searchActivity, BuildConfig.SDK_TRUNCATE_LENGTH);
                            int iconResource = activityInfo.getIconResource();
                            if (iconResource != 0) {
                                drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                                if (drawable == null) {
                                    StringBuilder sbM614j = C0141b.m614j("Invalid icon resource ", iconResource, " for ");
                                    sbM614j.append(searchActivity.flattenToShortString());
                                    Log.w("SuggestionsAdapter", sbM614j.toString());
                                    drawable = null;
                                }
                            } else {
                                drawable = null;
                            }
                        } catch (PackageManager.NameNotFoundException e10) {
                            Log.w("SuggestionsAdapter", e10.toString());
                        }
                        weakHashMap.put(strFlattenToShortString, drawable == null ? null : drawable.getConstantState());
                        drawableM1276g = drawable;
                    }
                    if (drawableM1276g == null) {
                        drawableM1276g = context.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView.setImageDrawable(drawableM1276g);
            if (drawableM1276g == null) {
                imageView.setVisibility(4);
            } else {
                imageView.setVisibility(0);
                drawableM1276g.setVisible(false, false);
                drawableM1276g.setVisible(true, false);
            }
        }
        ImageView imageView2 = aVar.f1362d;
        if (imageView2 == null) {
            i10 = 1;
        } else {
            int i14 = this.f1355Q;
            Drawable drawableM1276g2 = i14 == -1 ? null : m1276g(cursor.getString(i14));
            imageView2.setImageDrawable(drawableM1276g2);
            if (drawableM1276g2 == null) {
                imageView2.setVisibility(8);
                i10 = 1;
            } else {
                imageView2.setVisibility(0);
                drawableM1276g2.setVisible(false, false);
                i10 = 1;
                drawableM1276g2.setVisible(true, false);
            }
        }
        int i15 = this.f1349K;
        ImageView imageView3 = aVar.f1363e;
        if (i15 != 2 && (i15 != i10 || (i12 & 1) == 0)) {
            imageView3.setVisibility(8);
            return;
        }
        imageView3.setVisibility(0);
        imageView3.setTag(textView.getText());
        imageView3.setOnClickListener(this);
    }

    @Override // p039c3.AbstractC1673a
    /* JADX INFO: renamed from: c */
    public final void mo1272c(Cursor cursor) {
        try {
            super.mo1272c(cursor);
            if (cursor != null) {
                this.f1351M = cursor.getColumnIndex("suggest_text_1");
                this.f1352N = cursor.getColumnIndex("suggest_text_2");
                this.f1353O = cursor.getColumnIndex("suggest_text_2_url");
                this.f1354P = cursor.getColumnIndex("suggest_icon_1");
                this.f1355Q = cursor.getColumnIndex("suggest_icon_2");
                this.f1356R = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    @Override // p039c3.AbstractC1673a
    /* JADX INFO: renamed from: d */
    public final String mo1273d(Cursor cursor) {
        String strM1270i;
        String strM1270i2;
        if (cursor == null) {
            return null;
        }
        String strM1270i3 = m1270i(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strM1270i3 != null) {
            return strM1270i3;
        }
        SearchableInfo searchableInfo = this.f1358l;
        if (searchableInfo.shouldRewriteQueryFromData() && (strM1270i2 = m1270i(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strM1270i2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strM1270i = m1270i(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strM1270i;
    }

    @Override // p039c3.AbstractC1673a
    /* JADX INFO: renamed from: e */
    public final View mo1274e(ViewGroup viewGroup) {
        View viewInflate = this.f9392j.inflate(this.f9390h, viewGroup, false);
        viewInflate.setTag(new a(viewInflate));
        ((ImageView) viewInflate.findViewById(com.linguist.R.id.edit_query)).setImageResource(this.f1348J);
        return viewInflate;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: f */
    public final Drawable m1275f(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f1346H.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX INFO: renamed from: g */
    public final Drawable m1276g(String str) throws FileNotFoundException {
        WeakHashMap<String, Drawable.ConstantState> weakHashMap = this.f1347I;
        Context context = this.f1346H;
        Drawable drawableM1275f = null;
        if (str != null && !str.isEmpty()) {
            if (!"0".equals(str)) {
                try {
                    int i10 = Integer.parseInt(str);
                    String str2 = "android.resource://" + context.getPackageName() + "/" + i10;
                    Drawable.ConstantState constantState = weakHashMap.get(str2);
                    Drawable drawableNewDrawable = constantState == null ? null : constantState.newDrawable();
                    if (drawableNewDrawable != null) {
                        return drawableNewDrawable;
                    }
                    Object obj = C7472a.f41322a;
                    Drawable drawableM14849b = C7472a.c.m14849b(context, i10);
                    if (drawableM14849b != null) {
                        weakHashMap.put(str2, drawableM14849b.getConstantState());
                    }
                    return drawableM14849b;
                } catch (Resources.NotFoundException unused) {
                    Log.w("SuggestionsAdapter", "Icon resource not found: ".concat(str));
                    return null;
                } catch (NumberFormatException unused2) {
                    Drawable.ConstantState constantState2 = weakHashMap.get(str);
                    Drawable drawableNewDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                    if (drawableNewDrawable2 != null) {
                        return drawableNewDrawable2;
                    }
                    Uri uri = Uri.parse(str);
                    try {
                        if ("android.resource".equals(uri.getScheme())) {
                            try {
                                drawableM1275f = m1275f(uri);
                            } catch (Resources.NotFoundException unused3) {
                                throw new FileNotFoundException("Resource does not exist: " + uri);
                            }
                        } else {
                            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                            if (inputStreamOpenInputStream == null) {
                                throw new FileNotFoundException("Failed to open " + uri);
                            }
                            try {
                                Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                                try {
                                    inputStreamOpenInputStream.close();
                                } catch (IOException e10) {
                                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e10);
                                }
                                drawableM1275f = drawableCreateFromStream;
                            } catch (Throwable th2) {
                                try {
                                    inputStreamOpenInputStream.close();
                                } catch (IOException e11) {
                                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e11);
                                }
                                throw th2;
                            }
                        }
                    } catch (FileNotFoundException e12) {
                        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e12.getMessage());
                    }
                    if (drawableM1275f != null) {
                        weakHashMap.put(str, drawableM1275f.getConstantState());
                    }
                }
            }
        }
        return drawableM1275f;
    }

    @Override // p039c3.AbstractC1673a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View viewInflate = this.f9392j.inflate(this.f9391i, viewGroup, false);
            if (viewInflate != null) {
                ((a) viewInflate.getTag()).f1359a.setText(e10.toString());
            }
            return viewInflate;
        }
    }

    @Override // p039c3.AbstractC1673a, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View viewMo1274e = mo1274e(viewGroup);
            ((a) viewMo1274e.getTag()).f1359a.setText(e10.toString());
            return viewMo1274e;
        }
    }

    /* JADX INFO: renamed from: h */
    public final Cursor m1277h(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        builderFragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f1346H.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr, null);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f9382c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f9382c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1357k.m1029r((CharSequence) tag);
        }
    }
}
