package p039c3;

import android.database.Cursor;
import android.util.Log;
import android.widget.Filter;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.ViewOnClickListenerC0347v0;

/* JADX INFO: renamed from: c3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1674b extends Filter {

    /* JADX INFO: renamed from: a */
    public final a f9389a;

    /* JADX INFO: renamed from: c3.b$a */
    public interface a {
    }

    public C1674b(a aVar) {
        this.f9389a = aVar;
    }

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return ((ViewOnClickListenerC0347v0) this.f9389a).mo1273d((Cursor) obj);
    }

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        String string;
        Cursor cursorM1277h;
        ViewOnClickListenerC0347v0 viewOnClickListenerC0347v0 = (ViewOnClickListenerC0347v0) this.f9389a;
        if (charSequence == null) {
            string = "";
        } else {
            viewOnClickListenerC0347v0.getClass();
            string = charSequence.toString();
        }
        SearchView searchView = viewOnClickListenerC0347v0.f1357k;
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                cursorM1277h = viewOnClickListenerC0347v0.m1277h(viewOnClickListenerC0347v0.f1358l, string);
                if (cursorM1277h != null) {
                    cursorM1277h.getCount();
                } else {
                    cursorM1277h = null;
                }
            } catch (RuntimeException e10) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e10);
            }
        } else {
            cursorM1277h = null;
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorM1277h != null) {
            filterResults.count = cursorM1277h.getCount();
            filterResults.values = cursorM1277h;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        a aVar = this.f9389a;
        Cursor cursor = ((AbstractC1673a) aVar).f9382c;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            ((ViewOnClickListenerC0347v0) aVar).mo1272c((Cursor) obj);
        }
    }
}
